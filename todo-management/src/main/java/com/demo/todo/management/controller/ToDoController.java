package com.demo.todo.management.controller;

import com.demo.todo.management.dto.LoginRequestDto;
import com.demo.todo.management.dto.ToDoDto;
import com.demo.todo.management.security.CustomUserDetailsService;
import com.demo.todo.management.security.JWTUtil;
import com.demo.todo.management.service.ToDoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@AllArgsConstructor
@RequestMapping("api/todos")
public class ToDoController {

/*    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }*/

    @Autowired
    private ToDoService toDoService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JWTUtil jwtUtil;

    @Autowired
    CustomUserDetailsService userDetailsService;

    @PostMapping("jwt")
    public ResponseEntity<String> login(@RequestBody LoginRequestDto requestDto){
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(
                requestDto.getUsername(),
                requestDto.getPassword()
        );

        authenticationManager.authenticate(token);

//        userDetailsService.loadUserByUsername(token);

        String jwt = jwtUtil.generate(requestDto.getUsername());

        return ResponseEntity.ok(jwt);

    }

    @PostMapping("/addTask")
    @PreAuthorize("hasRole(\"ADMIN\")")
    public ResponseEntity<ToDoDto> addTodo(@RequestBody ToDoDto todoDto) {
        ToDoDto savedTodo = toDoService.addToDoTask(todoDto);
        return new ResponseEntity<>(savedTodo, HttpStatus.CREATED);
    }

    @GetMapping("/getAllTasks")
    @PostAuthorize("hasAnyRole(\"ADMIN\",\"USER\")")
    public ResponseEntity<List<ToDoDto>> getAllTodos() {
        List<ToDoDto> todoDtos = toDoService.getAllTodos();
        return new ResponseEntity<>(todoDtos, HttpStatus.OK);
    }
}
