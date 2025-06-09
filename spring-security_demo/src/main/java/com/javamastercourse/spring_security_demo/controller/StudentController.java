package com.javamastercourse.spring_security_demo.controller;

import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javamastercourse.spring_security_demo.model.Student;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class StudentController {
    
    List<Student> students = new java.util.ArrayList<>(
        List.of(
            new Student(1, "John Doe", "Java"),
            new Student(2, "Jane Smith", "Python"),
            new Student(3, "Alice Johnson", "JavaScript")
        )
    );

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return students;
    }

    @PostMapping("/students")
    public String addStudent(Student student) {
        System.out.println("Adding student: " + student);
        students.add(student);
        // Note: In a real application, you would save the student to a database.
        return "Student added: " + student.getName();
    }

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }
}
