package com.javamastercourse.spring_security_demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.javamastercourse.spring_security_demo.dao.UserRepository;
import com.javamastercourse.spring_security_demo.model.User;

@Service
public class UserService {

    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(12);

    @Autowired
    private UserRepository repository;

    public User saveUser(User user) 
    {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return repository.save(user);
    }
}
