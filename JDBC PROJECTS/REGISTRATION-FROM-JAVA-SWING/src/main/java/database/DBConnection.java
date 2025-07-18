/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HABIB
 */
public class DBConnection {
    public static Connection getDbConnection() {
        String jdbcUrl = "jdbc:mysql://localhost:3306/java_swing_project";
        String username = "root";
        String password = "admin";
        try {
            return DriverManager.getConnection(jdbcUrl, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
