package com.javamastercourse.spring_security_demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javamastercourse.spring_security_demo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

}
