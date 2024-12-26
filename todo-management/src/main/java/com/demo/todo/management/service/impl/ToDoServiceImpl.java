package com.demo.todo.management.service.impl;

import com.demo.todo.management.dto.ToDoDto;
import com.demo.todo.management.entity.ToDo;
import com.demo.todo.management.repository.ToDoRepository;
import com.demo.todo.management.service.ToDoService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
//@AllArgsConstructor
public class ToDoServiceImpl implements ToDoService {

    @Autowired
    private ToDoRepository toDoRepository;

    @Autowired
    private ModelMapper modelMapper;

    // TODO Add exceptions, add validations
    @Override
    public ToDoDto addToDoTask(ToDoDto ToDoDto) {
        ToDo ToDo = modelMapper.map(ToDoDto, ToDo.class);
        return modelMapper.map(toDoRepository.save(ToDo), ToDoDto.class);
    }

    @Override
    public ToDoDto getTodo(Long id) {
        ToDo ToDo = toDoRepository.findById(id).get();
        return modelMapper.map(ToDo, ToDoDto.class);
    }

    @Override
    public List<ToDoDto> getAllTodos() {
        return toDoRepository.findAll()
                .stream().map(ToDo -> modelMapper.map(ToDo, ToDoDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public ToDoDto updateTodo(ToDoDto toDoDto, Long id) {
        ToDo toDo = toDoRepository.findById(id).get();
        toDo.setTitle(toDoDto.getTitle());
        toDo.setDescription(toDoDto.getDescription());
        toDo.setCompleted(toDoDto.isCompleted());
        return modelMapper.map(toDoRepository.save(toDo), ToDoDto.class);
    }

    @Override
    public void deleteTodo(Long id) {
        toDoRepository.deleteById(id);
    }

    @Override
    public ToDoDto completeTodo(Long id) {

        ToDo toDo = toDoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found with id : " + id));

        toDo.setCompleted(Boolean.TRUE);

        ToDo updatedToDo = toDoRepository.save(toDo);

        return modelMapper.map(updatedToDo, ToDoDto.class);
    }

    @Override
    public ToDoDto inCompleteTodo(Long id) {

        ToDo toDo = toDoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found with id : " + id));

        toDo.setCompleted(Boolean.FALSE);

        ToDo updatedToDo = toDoRepository.save(toDo);

        return modelMapper.map(updatedToDo, ToDoDto.class);
    }
}
