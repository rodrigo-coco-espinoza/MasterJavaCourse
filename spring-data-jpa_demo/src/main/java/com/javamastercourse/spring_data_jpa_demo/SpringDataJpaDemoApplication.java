package com.javamastercourse.spring_data_jpa_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.javamastercourse.spring_data_jpa_demo.model.Student;

@SpringBootApplication
public class SpringDataJpaDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaDemoApplication.class, args);

		StudentRepository repository = context.getBean(StudentRepository.class);

		// Creating students and saving them to the database
		// Student student1 = context.getBean(Student.class);
		// Student student2 = context.getBean(Student.class);
		// Student student3 = context.getBean(Student.class);

		// student1.setStudentId(101);
		// student1.setName("Harry Potter");
		// student1.setMarks(79);

		// student2.setStudentId(102);
		// student2.setName("Hermione Granger");
		// student2.setMarks(95);

		// student3.setStudentId(103);
		// student3.setName("Ron Weasley");
		// student3.setMarks(68);

		//repository.save(student1);
		// repository.save(student2);
		// repository.save(student3);

		// Fetching all students
		// System.out.println("\nAll Students:");
		// repository.findAll().forEach(System.out::println);
		// Fetching a student by ID
		// System.out.println("\nStudent with ID 101:");
		// repository.findById(101).ifPresent(System.out::println);
		// Fetching students by name
		// System.out.println("\nStudents with name 'Ron Weasly':");
		// repository.findByName("Ron Weasley").forEach(System.out::println);
		// System.out.println();

		// Updating a student's marks
		Student studentToUpdate = context.getBean(Student.class);
		studentToUpdate.setStudentId(101);
		studentToUpdate.setName("Harry Potter");
		studentToUpdate.setMarks(85);
		repository.save(studentToUpdate);

		// Deleting a student
		repository.deleteById(103);

	}

}
