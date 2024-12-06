package com.jdbc;

import java.sql.*;

public class JDBCDemo {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/university";
    private static final String USER = "root";
    private static final String PASSWORD = "Password!123";

    public static void main(String[] args) {

//        Connection connection = null;

        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD)) {
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/university?user=root&password=Password!123");

            String query = "select * from students";

            PreparedStatement preparedStatement = connection.prepareStatement(query);

//            System.out.println(resultSet);

            System.out.println("Inserting data into tables");

            String insertQuery = """
                    Insert into students(StudentId, FirstName, LastName, isCertified, City)
                    Values (9, "Maxim", 'Zack', false, "Mexico");
                    """;
            preparedStatement.executeUpdate(insertQuery);

            System.out.println("Data Inserted");

            ResultSet resultSet = preparedStatement.executeQuery();

            System.out.println("Displaying records");

            while (resultSet.next()){
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString("FirstName")
                        + " " + resultSet.getString(3) + " " + resultSet.getBoolean(4)
                        + " " + resultSet.getString(5));
            }

            connection.close();
            preparedStatement.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
