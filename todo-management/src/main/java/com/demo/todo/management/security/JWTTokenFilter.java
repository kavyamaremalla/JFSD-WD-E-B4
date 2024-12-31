package com.demo.todo.management.security;

import com.demo.todo.management.entity.UserEntity;
import com.demo.todo.management.repository.UserRepository;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Service;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class JWTTokenFilter extends OncePerRequestFilter {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JWTUtil jwtUtil;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {

        String authorizationHeader = request.getHeader("Authorization");

        if (authorizationHeader == null || !authorizationHeader.startsWith("Bearer")){
            filterChain.doFilter(request , response);
            return;
        }

        String token = authorizationHeader.split(" ")[1];
        if(!jwtUtil.validate(token)){
            filterChain.doFilter(request, response);
            return;
        }

        String username = jwtUtil.getUserName(token); //From jwt token

        UserEntity userEntity = userRepository.findByUsernameOrEmail(username, username).get();

        Set<GrantedAuthority> authoritySet = userEntity.getRoles().stream()
                .map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toSet());

        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(username, userEntity.getPassword(), authoritySet);

        authenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

        SecurityContextHolder.getContext().setAuthentication(authenticationToken);

        filterChain.doFilter(request, response);

    }
}
