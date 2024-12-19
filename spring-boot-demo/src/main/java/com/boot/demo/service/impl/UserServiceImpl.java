package com.boot.demo.service.impl;

import com.boot.demo.dto.UserDto;
import com.boot.demo.entity.User;
import com.boot.demo.mapper.UserMapper;
import com.boot.demo.repository.UserRepository;
import com.boot.demo.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@AllArgsConstructor //injecting dependency of repository into service through constructor
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

//    @Autowired
//    private UserMapper userMapper;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public UserDto createUser(UserDto userDto) {

//        User user = userMapper.mapToUser(userDto);// to send this to repo
//
//        User savedUser = userRepository.save(user); // to send this to controller

//        return userMapper.mapToUserDto(savedUser);

        User user = modelMapper.map(userDto, User.class);

        return modelMapper.map(userRepository.save(user), UserDto.class);

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
