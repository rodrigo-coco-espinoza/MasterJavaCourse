package com.java_master_course;
import java.sql.*;


/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    public static void main(String[] args) {
        /*
         * importa package
         * load and register
         * create connection
         * create statement
         * process the result
         * close the connection
         */;

        try 
        {
            Class.forName("org.postgresql.Driver");
            Conection = Driver
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("churra");
            e.printStackTrace();
        }



        
    }
}
