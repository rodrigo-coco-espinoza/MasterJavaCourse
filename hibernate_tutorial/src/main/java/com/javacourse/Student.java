package com.javacourse;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student 
{
    @Id
    private int id;
    private String name;
    private int marks;
    @OneToOne
    private Teacher favouriteTeacher;
 

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
    public void setMarks(int marks) {
        this.marks = marks;
    }
    
    public int getMarks() {
        return marks;
    }
    public Teacher getFavouriteTeacher() {
        return favouriteTeacher;
    }
    public void setFavouriteTeacher(Teacher favouriteTeacher) {
        this.favouriteTeacher = favouriteTeacher;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", favouriteTeacher=" + favouriteTeacher + "]";
    }
    

    

}
