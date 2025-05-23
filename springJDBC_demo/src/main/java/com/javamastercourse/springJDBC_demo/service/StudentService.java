package com.javamastercourse.springJDBC_demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javamastercourse.springJDBC_demo.model.Student;
import com.javamastercourse.springJDBC_demo.reposotory.StudentReposotory;

@Service
public class StudentService {
    private StudentReposotory studentReposotory;

    public StudentReposotory getStudentReposotory() {
        return studentReposotory;
    }

    @Autowired
    public void setStudentReposotory(StudentReposotory studentReposotory) {
        this.studentReposotory = studentReposotory;
    }

    public void addStudent(Student student) {
        studentReposotory.save(student);
    }

    public List<Student> getAllStudents() {
        return studentReposotory.findAll();
    }


}
