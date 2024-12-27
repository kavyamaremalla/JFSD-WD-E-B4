package com.demo.todo.management.repository;

import com.demo.todo.management.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    //select * from users where username = "" or email = "";
    Optional<UserEntity> findByUsernameOrEmail(String username, String email);
}
