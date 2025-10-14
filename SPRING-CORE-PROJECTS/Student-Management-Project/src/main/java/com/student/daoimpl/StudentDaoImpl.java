package com.student.daoimpl;


import com.student.dao.StudentDao;
import com.student.database.DBConnection;
import com.student.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private DBConnection dbConnection;

    @Override
    public void addStudent(Student student) {
        Connection connection = dbConnection.getDbConnection();
        String sql = "insert into students (id, name, email) values (?, ?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, student.getId());
            ps.setString(2, student.getName());
            ps.setString(3, student.getEmail());
            ps.executeUpdate();
            System.out.println("Student added.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Student getStudentById(int id) {
        Connection connection = dbConnection.getDbConnection();
        String sql = "select * from students where id = ?";
        try ( PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Student(rs.getInt("id"), rs.getString("name"), rs.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        Connection connection = dbConnection.getDbConnection();
        List<Student> students = new ArrayList<>();
        String sql = "select * from students";
        try ( PreparedStatement ps = connection.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                students.add(new Student(rs.getInt("id"), rs.getString("name"), rs.getString("email")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }

    @Override
    public void updateStudent(Student student) {
        Connection connection = dbConnection.getDbConnection();
        String sql = "update students set name = ?, email = ? WHERE id = ?";
        try ( PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, student.getName());
            ps.setString(2, student.getEmail());
            ps.setInt(3, student.getId());
            ps.executeUpdate();
            System.out.println("Student updated.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteStudent(int id) {
        Connection connection = dbConnection.getDbConnection();
        String sql = "delete from students where id = ?";
        try ( PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Student deleted.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
