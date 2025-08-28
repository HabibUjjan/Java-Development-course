package com.student.daoimpl;

import com.student.dao.StudentDao;
import com.student.database.DBConnection;
import com.student.model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static java.sql.DriverManager.getConnection;

public class StudentDaoImpl implements StudentDao {

    @Override
    public void insert(Student s) throws Exception {
        Connection connection = DBConnection.getDbConnection();
        String sql = "INSERT INTO students VALUES (?, ?, ?, ?, ?, ?)";
        try (
             PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, s.getRollNumber());
            ps.setString(2, s.getName());
            ps.setInt(3, s.getAge());
            ps.setString(4, s.getGender());
            ps.setString(5, s.getCourse());
            ps.setString(6, s.getDepartment());
            ps.executeUpdate();
        }
    }

    @Override
    public void update(Student s) throws Exception {
        Connection connection = DBConnection.getDbConnection();
        String sql = "UPDATE students SET name=?, age=?, gender=?, course=?, department=? WHERE roll_number=?";
        try (
             PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, s.getName());
            ps.setInt(2, s.getAge());
            ps.setString(3, s.getGender());
            ps.setString(4, s.getCourse());
            ps.setString(5, s.getDepartment());
            ps.setString(6, s.getRollNumber());
            ps.executeUpdate();
        }
    }

    @Override
    public void delete(String rollNumber) throws Exception {
        Connection connection = DBConnection.getDbConnection();
        String sql = "DELETE FROM students WHERE roll_number=?";
        try (
             PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, rollNumber);
            ps.executeUpdate();
        }
    }

    @Override
    public List<Student> getAll() throws Exception {
        Connection connection = DBConnection.getDbConnection();
        List<Student> list = new ArrayList<>();
        String sql = "SELECT * FROM students";
        try (
             Statement st = connection.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                Student s = new Student();
                s.setRollNumber(rs.getString("roll_number"));
                s.setName(rs.getString("name"));
                s.setAge(rs.getInt("age"));
                s.setGender(rs.getString("gender"));
                s.setCourse(rs.getString("course"));
                s.setDepartment(rs.getString("department"));
                list.add(s);
            }
        }
        return list;
    }

    @Override
    public Student getByRollNumber(String rollNumber) throws Exception {
        Connection connection = DBConnection.getDbConnection();
        String sql = "SELECT * FROM students WHERE roll_number=?";
        try (
             PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, rollNumber);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Student s = new Student();
                    s.setRollNumber(rs.getString("roll_number"));
                    s.setName(rs.getString("name"));
                    s.setAge(rs.getInt("age"));
                    s.setGender(rs.getString("gender"));
                    s.setCourse(rs.getString("course"));
                    s.setDepartment(rs.getString("department"));
                    return s;
                }
            }
        }
        return null;
    }
}
