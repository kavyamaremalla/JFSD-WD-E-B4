package com.boot.demo.service.impl;

import com.boot.demo.dto.UserDto;
import com.boot.demo.entity.User;
import com.boot.demo.exception.EmailAlreadyExistsException;
import com.boot.demo.exception.ResourceNotFoundException;
import com.boot.demo.mapper.UserMapper;
import com.boot.demo.repository.UserRepository;
import com.boot.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor //injecting dependency of repository into service through constructor
public class UserServiceImpl implements UserService {

//    @Autowired
    private UserRepository userRepository;

//    @Autowired
//    private UserMapper userMapper;

//    @Autowired
    private ModelMapper modelMapper;

    @Override
    public UserDto createUser(UserDto userDto) {

//        User user = userMapper.mapToUser(userDto);// to send this to repo
//
//        User savedUser = userRepository.save(user); // to send this to controller

//        return userMapper.mapToUserDto(savedUser);

        User user = modelMapper.map(userDto, User.class);

        Optional<User> existingEmailUser = userRepository.findByEmail(user.getEmail());

        if (existingEmailUser.isPresent()){
            throw new EmailAlreadyExistsException("Email already exists, please provide unique new email");
        }

        return modelMapper.map(userRepository.save(user), UserDto.class);

    }

    @Override
    public List<UserDto> getAllUsers() {

        List<User> userList = userRepository.findAll();
        return userList.stream().map(user -> modelMapper.map(user, UserDto.class)).collect(Collectors.toList());
    }

    @Override
    public UserDto getUserById(Long userId) {
//        Optional<User> user = userRepository.findById(userId);

        return modelMapper.map(userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userId)),
                UserDto.class);
    }

    @Override
    public UserDto updateUser(UserDto newUserDetails) {

        UserDto existingUser = getUserById(newUserDetails.getId());

        existingUser.setFirstName(newUserDetails.getFirstName());
        existingUser.setLastName(newUserDetails.getLastName());
        existingUser.setEmail(newUserDetails.getEmail());

        User savedUser = userRepository.save(modelMapper.map(existingUser,User.class));

        return modelMapper.map(savedUser, UserDto.class);
    }

    @Override
    public void deleteUser(Long userId) {

        userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));

        userRepository.deleteById(userId);
    }
    @Override
    public UserDto getUserByIdAndFirstName(Long userId, String firstName) {

        Optional<User> user = userRepository.findByIdAndFirstName(userId, firstName);
        if (user.isEmpty()){
            throw new ResourceNotFoundException("User", "id and FirstName", userId);
        }
        return modelMapper.map(user, UserDto.class);
    }
}
