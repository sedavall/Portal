package com.myapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myapp.model.User;


public interface UserRepo extends JpaRepository<User, String> {
    User findByUsername(String username);
    User findByPassword(String password);
}

