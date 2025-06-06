package com.javacourse;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//import jakarta.persistence.Transient;
import jakarta.persistence.ManyToOne;

@Entity
//@Table(name = "teachers")
public class Teacher {
    
    @Id
    private int id;
    @Column(name = "first_name")
    private String name;
    //@Transient
    private String subject;
    @ManyToOne
    private Student student;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Teacher [id=" + id + ", name=" + name + ", subject=" + subject + ", student=" + student + "]";
    }

    

    
}
