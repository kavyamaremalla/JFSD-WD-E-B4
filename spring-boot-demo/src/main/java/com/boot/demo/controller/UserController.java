package com.boot.demo.controller;

import com.boot.demo.dto.UserDto;
import com.boot.demo.handler.ResponseEntityHandler;
import com.boot.demo.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/users")
@Tag(name = "CRUD API for User Management", description = "Create, Read, Update, Delete on users")
public class UserController {

    private UserService userService;

    @PostMapping("/create")
    @Operation(summary = "Create endpoint", description = "Adds new user to DB")
    @ApiResponse(responseCode = "201", description = "Successfully created")
    public ResponseEntity<Object> createUser(@RequestBody @Valid UserDto userDto){
        //insert statement
        UserDto savedUser = userService.createUser(userDto);
//        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
        return ResponseEntityHandler.generateResponse("Successfully Created !", HttpStatus.CREATED, savedUser);
    }

    @GetMapping("/getAllUsers")
    public ResponseEntity<List<UserDto>> getAllUsers(){
        List<UserDto> userList = userService.getAllUsers();
        return new ResponseEntity<>(userList, HttpStatus.OK);
    }

    @GetMapping("/getUserById/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable("id") Long id){
        UserDto user = userService.getUserById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PutMapping("/updateUserById/{id}")
    public ResponseEntity<UserDto> updateUser(@PathVariable("id") Long id, @RequestBody @Valid UserDto newUserDetails){
       newUserDetails.setId(id);
        UserDto updatedUser = userService.updateUser(newUserDetails);
       return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

    @DeleteMapping("/deleteUserById/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long id){
        userService.deleteUser(id);
        return new ResponseEntity<>("User deleted successfully", HttpStatus.ACCEPTED);
    }

    @GetMapping("query")
    public ResponseEntity<Object> getUserByQuery(@RequestParam Long userId, @RequestParam String firstName){
//        UserDto user = new UserDto(userId, firstName, "Doe", "john@gmail.com");
        UserDto user = userService.getUserByIdAndFirstName(userId,firstName);
        return ResponseEntity.ok().body(user);
    }

}
