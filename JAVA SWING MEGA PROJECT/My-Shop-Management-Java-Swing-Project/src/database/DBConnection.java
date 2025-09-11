/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HABIB
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getDbConnection() {
        String jdbcUrl = "jdbc:mysql://localhost:3306/shop_management01?useSSL=false&serverTimezone=UTC";
        String username = "root";
        String password = "admin";
        
        try {
            Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Database Connected Successfully: " + conn.getCatalog());
            return conn;
        } catch (SQLException e) {
            System.out.println("Database not Connected Successfully, error: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}


   

