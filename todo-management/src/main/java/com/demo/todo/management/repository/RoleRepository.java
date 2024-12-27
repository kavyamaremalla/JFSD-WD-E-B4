package com.demo.todo.management.repository;

import com.demo.todo.management.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
