package com.javamastercourse.springJDBC_demo.reposotory;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.javamastercourse.springJDBC_demo.model.Student;

@Repository
public class StudentReposotory 
{
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Student student) 
    {   
        String sql = "INSERT INTO student (studentId, name, marks) VALUES (?, ?, ?)";
        int rows = jdbcTemplate.update(sql, student.getStudentId(), student.getName(), student.getMarks());
        System.out.println("Rows inserted: " + rows);
    }

    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        return students;
    }
}
