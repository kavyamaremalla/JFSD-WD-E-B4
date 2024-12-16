package com.boot.demo.service.impl;

import com.boot.demo.entity.User;
import com.boot.demo.repository.UserRepository;
import com.boot.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@AllArgsConstructor //injecting dependency of repository into service through constructor
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }
}
