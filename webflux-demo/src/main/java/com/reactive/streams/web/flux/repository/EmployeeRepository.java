package com.reactive.streams.web.flux.repository;

import com.reactive.streams.web.flux.entity.Employee;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface EmployeeRepository extends ReactiveCrudRepository<Employee, String> {
}
