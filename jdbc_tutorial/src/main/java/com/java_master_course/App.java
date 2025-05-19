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

        String url ="jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String password = "123admin";
        Connection connection = null;
        String sql;

    

        try 
        {
            System.out.println("\nConnecting to the database...");
            //Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database!");

            Statement statement = connection.createStatement();

            // Insert data into the database
            int id = 3;
            String name = "Gandalf";
            int marks = 100;
            sql = "INSERT INTO student VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setInt(3, marks);
            preparedStatement.execute();

            System.out.println("Data inserted!");

            // Read data from the database
            sql = "SELECT * FROM student";
            ResultSet result = statement.executeQuery(sql);
            while (result.next())
            {
                System.out.print(result.getInt("id") + " - ");
                System.out.print(result.getString("name") + " - ");
                System.out.println(result.getInt("marks"));
            }            
            
            // Update data in the database
            sql = "UPDATE student SET marks = 99 WHERE id = 3";
            statement.execute(sql);
            System.out.println("Data updated!");
            result = statement.executeQuery("SELECT * FROM student WHERE id = 3");
            result.next();
            System.out.print(result.getInt("id") + " - ");
            System.out.print(result.getString("name") + " - ");
            System.out.println(result.getInt("marks"));

            // // Delete data from the database
            sql = "DELETE FROM student WHERE id = 3";
            statement.execute(sql);
            System.out.println("Data deleted!");


        }
        // catch (ClassNotFoundException e)
        // {
        //     System.out.println("Driver not found!");
        //     e.printStackTrace();
        // }
        catch (SQLException e)
        {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
        finally
        {
            // Close the connection
            if (connection != null)
            {
                try 
                {
                    connection.close();
                    System.out.println("Connection closed!");
                } 
                catch (SQLException e) 
                {
                    System.out.println("Failed to close the connection!");
                    e.printStackTrace();
                }
            }
        }



        
    }
}
