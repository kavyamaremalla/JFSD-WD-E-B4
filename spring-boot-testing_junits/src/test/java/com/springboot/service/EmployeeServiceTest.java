package com.springboot.service;

import com.springboot.exception.ResourceNotFoundException;
import com.springboot.model.Employee;
import com.springboot.repository.EmployeeRepository;
import com.springboot.service.impl.EmployeeServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.willDoNothing;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {

    @Mock
    private EmployeeRepository employeeRepository;

    @InjectMocks
    private EmployeeServiceImpl employeeService;

    private Employee employee;

    @BeforeEach
    public void setUp(){
        employee = new Employee();
        employee.setId(1L);
        employee.setFirstName("peter");
        employee.setLastName("parker");
        employee.setEmail("peter_parker@gmail.com");
    }

    @Test
    public void givenEmpObj_whenSaveEmp_thenReturnSavedEmpObj(){

        given(employeeRepository.findByEmail(anyString())).willReturn(Optional.empty());

//        Mockito.when(employeeRepository.save(employee)).thenReturn(employee);

        given(employeeRepository.save(employee)).willReturn(employee);

        Employee savedEmployee = employeeService.saveEmployee(employee);
        assertThat(savedEmployee).isNotNull();
    }

    @Test
//            (expected = ResourceNotFoundException.class)
    public void givenEmpObj_whenSaveEmpWithExistingEmail_thenReturnSavedEmpObj_thenThrowsException(){

        given(employeeRepository.findByEmail(employee.getEmail())).willReturn(Optional.of(employee));

        // Mockito.when(employeeRepository.findByEmail(employee.getEmail())).thenReturn(Optional.of(employee));

        Exception exception = Assertions.assertThrows(ResourceNotFoundException.class, ()-> employeeService.saveEmployee(employee));
        verify(employeeRepository, never()).save(any(Employee.class));

        String expectedMessage = "Employee already exist with given email:" + employee.getEmail();
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void whenGetAllEmployees_thenReturnEmployeesList() {
        Employee employee2 = new Employee();
        employee2.setFirstName("john");
        employee2.setLastName("doe");
        employee2.setEmail("jd@gmail.com");

        given(employeeRepository.findAll())
                .willReturn(List.of(employee, employee2));

        List<Employee> employeeList = employeeService.getAllEmployees();
        assertThat(employeeList).isNotNull();
        assertThat(employeeList.size()).isEqualTo(2);
    }

    @Test
    public void testGivenEmptyEmployeesList_whenGetAllEmployees_thenReturnEmptyEmployeesList() {
        given(employeeRepository.findAll())
                .willReturn(Collections.emptyList());
        List<Employee> employeeList = employeeService.getAllEmployees();
        assertThat(employeeList).isEmpty();
        assertThat(employeeList.size()).isEqualTo(0);
    }

    @Test
    public void givenEmployeeId_whenGetEmployeeById_thenReturnEmployeeObject() {
        given(employeeRepository.findById(1L)).willReturn(Optional.of(employee));
        Employee savedEmployee = employeeService.getEmployeeById(employee.getId()).get();
        assertThat(savedEmployee).isNotNull();
    }

    //update, other get endpoint scenarios

    @Test
    public void givenEmployeeId_whenDeleteEmployee_thenReturnNothing() {
        willDoNothing().given(employeeRepository).deleteById(employee.getId());

     Mockito.doNothing().when(employeeRepository).deleteById(employee.getId());

        employeeService.deleteEmployee(employee.getId());
        verify(employeeRepository, times(1)).deleteById(employee.getId());
    }
}

