package com.boot.demo.mapper;

import com.boot.demo.dto.UserDto;
import com.boot.demo.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    /*    From repository to controller  */
    public  UserDto mapToUserDto(User user){
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setEmail(user.getEmail());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());

        return userDto;
    }

    /*    From controller to repository  */
    public  User mapToUser(UserDto userDto){
        User user = new User();
        user.setId(userDto.getId());
        user.setFirstName(userDto.getFirstName());
        user.setEmail(userDto.getEmail());
        user.setLastName(userDto.getLastName());

        return user;
    }
}
