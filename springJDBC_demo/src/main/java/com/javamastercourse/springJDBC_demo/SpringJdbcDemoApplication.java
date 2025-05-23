package com.javamastercourse.springJDBC_demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.javamastercourse.springJDBC_demo.model.Student;
import com.javamastercourse.springJDBC_demo.service.StudentService;

@SpringBootApplication
public class SpringJdbcDemoApplication {

	public static void main(String[] args) 
	{
		ApplicationContext context = SpringApplication.run(SpringJdbcDemoApplication.class, args);

		Student student = context.getBean(Student.class);
		student.setStudentId(101);
		student.setName("Luke");
		student.setMarks(90);

		StudentService studentService = context.getBean(StudentService.class);
		studentService.addStudent(student);

		List<Student> students = studentService.getAllStudents();
		System.out.println("Students: " + students);



	}

}
