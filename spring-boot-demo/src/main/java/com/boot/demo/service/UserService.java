package com.boot.demo.service;

import com.boot.demo.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto userDto); //create an user into DB (insert query), Post call

    List<UserDto> getAllUsers(); //get all user details (select * from users), Get call

    UserDto getUserById(Long userId);//get a particular user with id (select * from users where id ), get call

    UserDto updateUser(UserDto user);//update values set values, update call : put and patch

    void deleteUser(Long userId);//delete from users where id = , delete call

    UserDto getUserByIdAndFirstName(Long userId, String firstName);






}
