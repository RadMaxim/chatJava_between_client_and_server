package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateConnection {
    static private String url ="jdbc:postgresql://localhost:5432/middleTable";
    static private String password = "1111";
    static private String username = "postgres";
    static Connection connection;
    static {
        try {
            connection = DriverManager.getConnection(url,username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
