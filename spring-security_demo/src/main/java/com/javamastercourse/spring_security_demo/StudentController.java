package com.javamastercourse.spring_security_demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    
    List<Student> students = List.of(
        new Student(1, "John Doe", "Java"),
        new Student(2, "Jane Smith", "Python"),
        new Student(3, "Alice Johnson", "JavaScript")
    );

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return students;
    }

    @PostMapping("/students")
    public String addStudent(Student student) {
        students.add(student);
        // Note: In a real application, you would save the student to a database.
        return "Student added: " + student.getName();
    }
}
