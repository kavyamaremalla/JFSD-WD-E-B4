package com.boot.demo.repository;

import com.boot.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    //db queries here
    Optional<User> findByIdAndFirstName(Long userId, String FirstName);
        //select * from users where id = userId and first_name = FirstName;

    Optional<User> findByEmail(String email);
    //select * from users where email = ?email

//    @Query()
//    User findByLastName(String LastName);

}
