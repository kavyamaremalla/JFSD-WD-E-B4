package com.springboot.repository;

import com.springboot.model.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    private Employee employee;

    @BeforeEach
    public void setUp(){
        employee = new Employee();
        employee.setFirstName("peter");
        employee.setLastName("parker");
        employee.setEmail("peter_parker@gmail.com");
    }

    @Test
    public void givenEmployeeObject_whenSave_thenReturnSavedEmployee(){
        Employee savedEmployee = employeeRepository.save(employee);

        //assertions

        assertThat(savedEmployee).isNotNull();
        assertThat(savedEmployee.getId()).isGreaterThan(0);
    }

    @Test
    public void whenFindAll_thenReturnEmployeeList(){

        employeeRepository.save(employee);

        Employee employee2 = new Employee();
        employee2.setFirstName("john");
        employee2.setLastName("doe");
        employee2.setEmail("john_doe@gmail.com");

        employeeRepository.save(employee2);

        List<Employee> employeeList = employeeRepository.findAll();

        //assertions
        assertThat(employeeList).isNotNull();
        assertThat(employeeList.size()).isEqualTo(2);
    }

    @Test
    public void givenEmployeeId_whenFindById_thenReturnEmployeeObject(){

        Employee savedEmployee = employeeRepository.save(employee);
        Employee empDetailsFromDb = employeeRepository.findById(savedEmployee.getId()).get();

        //assertions
        assertThat(empDetailsFromDb).isNotNull();
        assertEquals(empDetailsFromDb.getEmail(), employee.getEmail());
    }

    @Test
    public void givenEmpObj_whenUpdateEmp_thenReturnUpdatedEmp_Obj(){
        Employee savedEmployee = employeeRepository.save(employee);
        Employee empDetailsFromDb = employeeRepository.findById(savedEmployee.getId()).get();
        empDetailsFromDb.setEmail("johndoe1990@gmail.com");

        Employee updateEmployee = employeeRepository.save(empDetailsFromDb);

        //assertion
        assertThat(updateEmployee.getEmail()).isEqualTo("johndoe1990@gmail.com");
    }

    @Test
    public void givenEmpObj_whenDeleteEmp_thenRemoveEmployee(){
        Employee savedEmployee = employeeRepository.save(employee);
        employeeRepository.deleteById(savedEmployee.getId());

        Optional<Employee> employeeOptional = employeeRepository.findById(employee.getId());
        assertThat(employeeOptional).isEmpty();
    }
}
