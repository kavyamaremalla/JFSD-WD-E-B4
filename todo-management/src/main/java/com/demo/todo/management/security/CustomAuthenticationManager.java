package com.demo.todo.management.security;

import com.demo.todo.management.entity.UserEntity;
import com.demo.todo.management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class CustomAuthenticationManager implements AuthenticationManager {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        String username = authentication.getName(); //from JWT token
        String password = authentication.getCredentials().toString(); //from JWT Token

        if(isValidUser(username, password)){
            return new UsernamePasswordAuthenticationToken(username, password);
        }

        else{
            throw new AuthenticationException("Invalid credentials. Please check the provided username and password"){};
        }
    }

    private boolean isValidUser(String username, String password) {
        Optional<UserEntity> userEntity = userRepository.findByUsernameOrEmail(username, username);

        if (userEntity.isEmpty()){
            throw new RuntimeException("Please check your credentials, either username or password is incorrect");
        }

        return userEntity.get().getUsername().equals(username) &&
                passwordEncoder.matches(password, userEntity.get().getPassword());
    }
}
