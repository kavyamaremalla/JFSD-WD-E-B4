package com.example.thymeleaf.service.impl;

import com.example.thymeleaf.dto.EmployeeDto;
import com.example.thymeleaf.entity.Employee;
import com.example.thymeleaf.repository.EmployeeRepository;
import com.example.thymeleaf.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    private ModelMapper modelMapper;

    @Override
    public void save(EmployeeDto employeeDto) {
        //Add spring exception handling
        employeeRepository.save(modelMapper.map(employeeDto, Employee.class));
    }

    @Override
    public EmployeeDto getById(Long id) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(id);

        Employee employeeEntity = employeeRepository.getById(id);

        if (null == employeeEntity){
            System.out.println("Employee is null");
        }

        Employee employee = null;

        if(optionalEmployee.isPresent()){
            employee = optionalEmployee.get();
        }else{
            throw new RuntimeException("Employee not found for id : " + id);
        }
        return modelMapper.map(employee, EmployeeDto.class);
    }

    @Override
    public List<EmployeeDto> getAllEmployees() {
        List<Employee> employeeList = employeeRepository.findAll();
        return employeeList.stream().map(employee -> modelMapper.map(employee, EmployeeDto.class)).collect(Collectors.toList());
    }

    @Override
    public void deleteById(Long id) {

        Optional<Employee> optionalEmployee = employeeRepository.findById(id);

        String response;

        if(optionalEmployee.isPresent()){
            response = "Employee Deleted Successfully";
            employeeRepository.deleteById(id);
        }else{
            response = "Please check your id, couldn't delete a non-existing employee";
            throw new RuntimeException("Employee not found for id : " + id);
        }
        System.out.println(response);

    }
}
