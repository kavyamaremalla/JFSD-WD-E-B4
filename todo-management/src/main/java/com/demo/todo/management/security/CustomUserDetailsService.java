package com.demo.todo.management.security;

import com.demo.todo.management.entity.UserEntity;
import com.demo.todo.management.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
//@AllArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String usernameOrEmail) throws UsernameNotFoundException {

        UserEntity userEntity = userRepository.findByUsernameOrEmail(usernameOrEmail, usernameOrEmail).get();

        Set<GrantedAuthority> authoritySet = userEntity.getRoles().stream()
                                                       .map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toSet());

        return new User(
                    usernameOrEmail,
                    userEntity.getPassword(),
                    authoritySet
        );
    }
}
