package Assignment9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


// Creating a class named DataBaseConnect
public class DataBaseConnect {

    public static void main(String[] args) {
        // Code for establishing the connection between the MySql Database using jdbc driver
        String url = "jdbc:mysql://localhost:3306/assignment";
        String username = "root";
        String password = "";
        try {
            Class.forName("com.mysql.jdbc.Driver"); // Loading the driver

            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();

            // Inserting the results -
            int result = statement.executeUpdate("INSERT INTO student (name, age, gender) VALUES ('Arjun', 19,'Male')");
            int result2 = statement.executeUpdate("UPDATE student SET name='Arjun Tyagi', age=20, gender='Male' WHERE id=3");

            display(statement);

            connection.close();
        }
        catch (Exception e) {
            System.out.println("Where is your MySQL JDBC Driver?" + "\n" + e);
            e.printStackTrace();
            return;
        }
    }

    public static void display(Statement statement){
        try{
            ResultSet resultSet = statement.executeQuery("SELECT * FROM student");

            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getInt(3) + " " + resultSet.getString(4));
            }
        } catch (Exception e) {
            System.out.println("Error displaying data: " + e.getMessage());
        }
    }
}