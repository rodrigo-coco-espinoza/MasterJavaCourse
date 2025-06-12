package com.javamastercourse.spring_security_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HelloController 
{
    @GetMapping("/greet")
    public String greet(HttpServletRequest request)
    {
        return "Hello, World!";
    }


    @GetMapping("/about")
    public String about(HttpServletRequest request)
    {
        return "This is a Spring Security demo application." + request.getSession().getId();
    }
}
