package com.boot.demo.service.impl;

import com.boot.demo.entity.User;
import com.boot.demo.repository.UserRepository;
import com.boot.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@AllArgsConstructor //injecting dependency of repository into service through constructor
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long userId) {
        return userRepository.findById(userId).orElseThrow();
    }

    @Override
    public User updateUser(User newUserDetails) {

        User existingUser = getUserById(newUserDetails.getId());

        existingUser.setFirstName(newUserDetails.getFirstName());
        existingUser.setLastName(newUserDetails.getLastName());
        existingUser.setEmail(newUserDetails.getEmail());

        return userRepository.save(existingUser);
    }

    @Override
    public void deleteUser(Long userId) {

        userRepository.deleteById(userId);
    }
    @Override
        public User getUserByIdAndFirstName(Long userId, String firstName) {
        return userRepository.findByIdAndFirstName(userId, firstName);
    }
}
