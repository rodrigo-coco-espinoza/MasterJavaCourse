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
                                            .configure("hibernate.cfg.xml")
                                            .buildSessionFactory();
        
        Session session = sessionFactory.openSession();

        /*
         * Student student = new Student();
         * student.setId(3);
         * student.setName("Gandalf");
         * student.setMarks(90);
         * System.out.println(student);
         *
         * Transaction transaction = session.beginTransaction();
         * session.persist(student);
         * transaction.commit();
         */
        
         Teacher teacher = new Teacher();
         teacher.setId(3);
         teacher.setName("Snape");
         teacher.setSubject("Potions");
         System.out.println(teacher);
         
        Transaction transaction = session.beginTransaction();
        session.persist(teacher);
        transaction.commit();
        
        
        session.close();
        sessionFactory.close();


    }
}
