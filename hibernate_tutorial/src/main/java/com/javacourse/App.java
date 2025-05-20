package com.javacourse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

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
        System.out.println(teacher);
        // Create a Student object
        Student student = new Student();
        student.setId(1);
        student.setName("Frodo");
        student.setMarks(50);
        student.setFavouriteTeacher(teacher);
        System.out.println(student);
        
        Transaction transaction = session.beginTransaction();
        session.persist(student);
        session.persist(teacher);
        transaction.commit();
        
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
