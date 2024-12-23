package com.example.thymeleaf.service;

import com.example.thymeleaf.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {

    void save(EmployeeDto employeeDto);

    EmployeeDto getById(Long id);

    List<EmployeeDto> getAllEmployees();

    void deleteById(Long id);

    //update -> task
}
