package com.reactive.streams.web.flux.service.impl;

import com.reactive.streams.web.flux.dto.EmployeeDto;
import com.reactive.streams.web.flux.entity.Employee;
import com.reactive.streams.web.flux.repository.EmployeeRepository;
import com.reactive.streams.web.flux.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
//@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Mono<EmployeeDto> saveEmployee(EmployeeDto employeeDto) {

        Employee employee = modelMapper.map(employeeDto, Employee.class);
        Mono<Employee> employeeMono = employeeRepository.save(employee);

        return employeeMono.map(empEntity -> modelMapper.map(empEntity, EmployeeDto.class));
    }

    @Override
    public Mono<EmployeeDto> getEmployee(String employeeId) {
        return employeeRepository.findById(employeeId)
                .map(empEntity -> modelMapper.map(empEntity, EmployeeDto.class));
    }

    @Override
    public Flux<EmployeeDto> getAllEmployees() {
        return employeeRepository.findAll()
                .map(empEntity -> modelMapper.map(empEntity, EmployeeDto.class));
    }

    @Override
    public Mono<EmployeeDto> updateEmployee(EmployeeDto employeeDto, String empId) {
        // TODO write implementation and test this API
        return null;
    }

    @Override
    public Mono<Void> deleteEmployee(String employeeId) {
        return employeeRepository.deleteById(employeeId);
    }
}
