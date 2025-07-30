/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daoimpl;

/**
 *
 * @author HABIB
 */

import dao.TeacherDao;
import database.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Teacher;


public class TeacherDaoImpl implements TeacherDao {
    @Override
    public void addTeacher(Teacher teacher) {
        Connection con = DBConnection.getDbConnection();
        try {
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO teachers (name, teacherId, qualification, subject, contact) VALUES ('"
                    + teacher.getName() + "', '"
                    + teacher.getTeacherId() + "', '"
                    + teacher.getQualification() + "', '"
                    + teacher.getSubject() + "', '"
                    + teacher.getContact() + "')";

            stmt.executeUpdate(sql);
            System.out.println("Teacher inserted successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateTeacher(Teacher teacher) {
        Connection con = DBConnection.getDbConnection();
        try {
            Statement stmt = con.createStatement();
            String sql = "UPDATE teachers SET name = '" + teacher.getName()
                    + "', qualification = '" + teacher.getQualification()
                    + "', subject = '" + teacher.getSubject()
                    + "', contact = '" + teacher.getContact()
                    + "' WHERE teacherId = '" + teacher.getTeacherId() + "'";

            int rows = stmt.executeUpdate(sql);
            if (rows > 0) {
                System.out.println("Teacher updated successfully.");
            } else {
                System.out.println("Teacher not found with TeacherId: " + teacher.getTeacherId());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteTeacher(String teacherId) {
        Connection con = DBConnection.getDbConnection();
        try {
            Statement stmt = con.createStatement();
            String sql = "DELETE FROM teachers WHERE teacherId = '" + teacherId + "'";

            int rows = stmt.executeUpdate(sql);
            if (rows > 0) {
                System.out.println("Teacher deleted successfully.");
            } else {
                System.out.println("Teacher not found with TeacherId: " + teacherId);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Teacher> getAllTeachers() {
        List<Teacher> list = new ArrayList<>();
        Connection con = DBConnection.getDbConnection();
        try {
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM teachers";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Teacher teacher = new Teacher();
                teacher.setName(rs.getString("name"));
                teacher.setTeacherId(rs.getString("teacherId"));
                teacher.setQualification(rs.getString("qualification"));
                teacher.setSubject(rs.getString("subject"));
                teacher.setContact(rs.getString("contact"));

                list.add(teacher);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
