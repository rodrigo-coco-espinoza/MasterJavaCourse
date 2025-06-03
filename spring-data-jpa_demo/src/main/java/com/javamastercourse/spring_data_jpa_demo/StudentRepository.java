package com.javamastercourse.spring_data_jpa_demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.javamastercourse.spring_data_jpa_demo.model.Student;

@Repository
public interface StudentRepository extends  JpaRepository<Student, Integer> {
    
    // Query DSL: Domain Specific Language
    // This is a method that Spring Data JPA will automatically implement
    //@Query("SELECT s FROM Student s WHERE s.name = ?1") this is what the query looks like
    List<Student> findByName(String name);

    List<Student> findByMarks(int marks);

    List<Student> findByMarksGreaterThan(int marks);

    
} 
