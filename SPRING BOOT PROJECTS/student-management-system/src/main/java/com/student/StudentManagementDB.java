package com.student;

import java.sql.*;
import java.util.Scanner;

public class StudentManagementDB {
    static final String DB_URL = "jdbc:mysql://localhost:3306/studentDB";
    static final String USER = "root";
    static final String PASS = "admin";

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("====== Student Management DB ======");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayAllStudents();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 3);
    }

    public static void addStudent() {
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();
        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
            String sql = "INSERT INTO students (name, rollNo, marks) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.setInt(2, rollNo);
            stmt.setDouble(3, marks);

            int rows = stmt.executeUpdate();
            if (rows > 0) System.out.println("Student added to database successfully!\n");
            } catch (SQLException e) {
            System.out.println("Database Error: " + e.getMessage());
        }
    }

    public static void displayAllStudents() {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
            String sql = "SELECT * FROM students";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("------ Students List ------");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Roll No: " + rs.getInt("rollNo"));
                System.out.println("Marks: " + rs.getDouble("marks"));
                String status = rs.getDouble("marks") >= 40 ? "Passed" : "Failed";
                System.out.println("Status: " + status);

                }
             } catch (SQLException e) {
            System.out.println("Database Error: " + e.getMessage());
        }
    }
}
