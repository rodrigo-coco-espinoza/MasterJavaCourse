package com.java_master_course;
import java.sql.*;


/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    public static void main(String[] args) throws SQLException {
        /*
         * importa package
         * load and register
         * create connection
         * create statement
         * process the result
         * close the connection
         */;

        String url ="jdbc:postgresql://localhost:5432/database";
        String user = "postgres";
        String password = "0000";


        try 
        {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);

            System.out.println("Connected to the database!");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Driver not found!");
            e.printStackTrace();
        }
        catch (SQLException e)
        {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
        finally
        {
            System.out.println("End of program");
        }



        
    }
}
