package com.javamastercourse.springJDBC_demo.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.javamastercourse.springJDBC_demo.model.Student;

@Repository
public class StudentRepository 
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
        String sql = "INSERT INTO student (studentid, name, marks) VALUES (?, ?, ?)";
        int rows = jdbcTemplate.update(sql, student.getStudentId(), student.getName(), student.getMarks());
        System.out.println("Rows inserted: " + rows);
    }

    public List<Student> findAll() {
        
        String sql = "SELECT * FROM student";
        
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
                Student student = new Student();
                student.setStudentId(rs.getInt("studentid"));
                student.setName(rs.getString("name"));
                student.setMarks(rs.getInt("marks"));
                return student;
        });
    }
}
