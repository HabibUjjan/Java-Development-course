package com.student.database;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Component
public class DBConnection {
    public static Connection getDbConnection() {
        String jdbcUrl = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "admin";
        try {
            return DriverManager.getConnection(jdbcUrl, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

