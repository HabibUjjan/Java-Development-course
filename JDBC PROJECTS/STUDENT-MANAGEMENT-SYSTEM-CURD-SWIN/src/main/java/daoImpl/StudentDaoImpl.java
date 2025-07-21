/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daoImpl;

import dao.StudentDao;
import database.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Student;

/**
 *
 * @author HABIB
 */

public class StudentDaoImpl implements StudentDao {

    @Override
    public void addStudent(Student student) {
        Connection connection = DBConnection.getDbConnection();
        try {
          String query = "INSERT INTO students (name, age, roll_number, gender, course, department) VALUES ('" 
        + student.getName() + "', " 
        + student.getAge() + ", '" 
        + student.getRollNumber() + "', '" 
        + student.getGender() + "', '" 
        + student.getCourse() + "', '" 
        + student.getDepartment() + "')";

Statement stmt = connection.createStatement();
stmt.executeUpdate(query);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> studentList = new ArrayList<>();
        Connection connection = DBConnection.getDbConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            while (rs.next()) {
                Student s = new Student(
                    rs.getString("name"),
                    rs.getInt("age"),
                    rs.getString("roll_number"),
                    rs.getString("gender"),
                    rs.getString("course"),
                    rs.getString("department")
                );
                studentList.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return studentList;
    }

    @Override
public void updateStudent(Student student) {
    Connection connection = DBConnection.getDbConnection();
    try {
        String query = "UPDATE students SET " +
                "name = '" + student.getName() + "', " +
                "age = " + student.getAge() + ", " +
                "roll_number = '" + student.getRollNumber() + "', " +
                "gender = '" + student.getGender() + "', " +
                "course = '" + student.getCourse() + "', " +
                "department = '" + student.getDepartment() + "' " +
                "WHERE roll_number = '" + student.getRollNumber() + "'";

        Statement stmt = connection.createStatement();
        stmt.executeUpdate(query);
    } catch (Exception e) {
        e.printStackTrace();
    }
}


    @Override
public void deleteStudent(String rollNumber) {
    Connection connection = DBConnection.getDbConnection();
    try {
        String query = "DELETE FROM students WHERE roll_number = '" + rollNumber + "'";
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(query);
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}



