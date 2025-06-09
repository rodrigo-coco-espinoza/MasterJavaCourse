package com.javamastercourse.spring_security_demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javamastercourse.spring_security_demo.dao.UserRepository;
import com.javamastercourse.spring_security_demo.model.User;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User saveUser(User user) 
    {
        return repository.save(user);
    }
}
