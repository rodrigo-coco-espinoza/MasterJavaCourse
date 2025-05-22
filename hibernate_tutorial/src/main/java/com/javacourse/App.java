package com.javacourse;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public final class App {
    private App() {
    }
    public static void main(String[] args) 
    {


        // Configuration configuration = new Configuration();
        // configuration.addAnnotatedClass(com.javacourse.Teacher.class);
        // configuration.configure("hibernate.cfg.xml");
        // SessionFactory sessionFactory = configuration.buildSessionFactory();

        SessionFactory sessionFactory = new Configuration()
                                            .addAnnotatedClass(com.javacourse.Teacher.class)
                                            .addAnnotatedClass(com.javacourse.Student.class)
                                            .configure("hibernate.cfg.xml")
                                            .buildSessionFactory();
        
        Session session = sessionFactory.openSession();



        // Create a Teacher object 
        Teacher teacher = new Teacher();
        teacher.setId(1);
        teacher.setName("Gandalf");
        teacher.setSubject("Ancient magic");


        Teacher teacher2 = new Teacher();
        teacher2.setId(2);
        teacher2.setName("Dumbledore");
        teacher2.setSubject("Defense against dark arts");

        Teacher teacher3 = new Teacher();
        teacher3.setId(3);
        teacher3.setName("Snape");
        teacher3.setSubject("Potions");

        // Create a Student object
        Student student = new Student();
        student.setId(1);
        student.setName("Frodo");
        student.setMarks(50);
        // student.setFavouriteTeacher(teacher);
        // student.setAsignedTeachers(Arrays.asList(teacher, teacher2, teacher3));

        Student student2 = new Student();
        student2.setId(2);
        student2.setName("Harry");
        student2.setMarks(80);
        // student2.setFavouriteTeacher(teacher2);
        // student2.setAsignedTeachers(Arrays.asList(teacher2, teacher3));

        // Asing a teacher to a student
        teacher.setStudent(student);
        teacher2.setStudent(student2);
        teacher3.setStudent(student2);
        
        Transaction transaction = session.beginTransaction();
        session.persist(teacher);
        session.persist(teacher2);
        session.persist(teacher3);
        session.persist(student);
        session.persist(student2);
        transaction.commit();

        // Query using HQL
        String name = "Frodo";
        Query hqlQuery = session.createQuery("select name, marks from Student");
        List<Object[]> studentList = hqlQuery.getResultList();
        for (Object[] data : studentList) {
            System.out.println(data[0] + " " + data[1]);
        }
        
        // Transaction transaction = session.beginTransaction();
        // session.persist(teacher);
        // transaction.commit();

        // Fetching data
        // Teacher teacher = session.get(Teacher.class, 2);
        // System.out.println(teacher);

        // Update data
        // Teacher teacher = new Teacher();
        // teacher.setId(4);
        // teacher.setName("Filchard");
        // teacher.setSubject("Defense against dark arts");

        // Transaction transaction = session.beginTransaction();
        // session.merge(teacher);
        // transaction.commit();

        // Delete data
        // Teacher teacherDelete = session.get(Teacher.class, 4);
        // Transaction transaction = session.beginTransaction();
        // session.remove(teacherDelete);
        // transaction.commit();
                
        
        session.close();
        sessionFactory.close();


    }
}
