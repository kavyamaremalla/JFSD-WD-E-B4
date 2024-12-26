package com.demo.todo.management.service;

import com.demo.todo.management.dto.ToDoDto;

import java.util.List;

public interface ToDoService {

    ToDoDto addToDoTask(ToDoDto ToDoDto);
    ToDoDto getTodo(Long id);
    List<ToDoDto> getAllTodos();
    ToDoDto updateTodo(ToDoDto ToDoDto,Long id);
    void deleteTodo(Long id);
    ToDoDto completeTodo(Long id);
    ToDoDto inCompleteTodo(Long id);
}
