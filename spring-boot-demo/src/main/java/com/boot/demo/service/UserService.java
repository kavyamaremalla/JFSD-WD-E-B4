package com.boot.demo.service;

import com.boot.demo.entity.User;

import java.util.List;

public interface UserService {
    User createUser(User user); //create an user into DB (insert query), Post call

    List<User> getAllUsers(); //get all user details (select * from users), Get call

    User getUserById(Long userId);//get a particular user with id (select * from users where id ), get call

    User updateUser(User newUserDetails);//update values set values, update call : put and patch

    void deleteUser(Long userId);//delete from users where id = , delete call

    User getUserByIdAndFirstName(Long userId, String firstName);
}
