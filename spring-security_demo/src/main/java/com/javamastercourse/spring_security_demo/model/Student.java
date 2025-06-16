package com.javamastercourse.spring_security_demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String tech;
}

// @Entity
// public class Student {
//     @Id
//     private int id;
//     private String name;
//     private String tech;

//     public Student() {}

//     public Student(int id, String name, String tech) {
//         this.id = id;
//         this.name = name;
//         this.tech = tech;
//     }

//     public int getId() { return id; }
//     public void setId(int id) { this.id = id; }

//     public String getName() { return name; }
//     public void setName(String name) { this.name = name; }

//     public String getTech() { return tech; }
//     public void setTech(String tech) { this.tech = tech; }
// }