package com.example.tatjavalab4.repository;

import com.example.tatjavalab4.data.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByIdNotNull();
}
