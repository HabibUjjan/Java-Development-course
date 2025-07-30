/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daoimpl;

import dao.StudentDao;
import database.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Student;


/**
 *
 * @author HABIB
 */

public class StudentDaoImpl implements StudentDao {

    @Override
    public void addStudent(Student student) {
        Connection con = DBConnection.getDbConnection();
        try {
            Statement stmt = con.createStatement();
            String sql = "insert into students (name, age, name_c, rollnumber, gender, address, contact) VALUES ('"
                    + student.getName() + "', "
                    + student.getAge() + ", '"
                    + student.getStudentClass() + "', '"
                    + student.getRollNo() + "', '"
                    + student.getGender() + "', '"
                    + student.getAddress() + "', '"
                    + student.getContact() + "')";
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Student added successfully.");
            stmt.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public void updateStudent(Student student) {
        Connection con = DBConnection.getDbConnection();
        try {
            Statement stmt = con.createStatement();
            String sql = "update students set name = '" + student.getName()
                    + "', age = " + student.getAge()
                    + ", name_c = '" + student.getStudentClass()
                    + "', gender = '" + student.getGender()
                    + "', address = '" + student.getAddress()
                    + "', contact = '" + student.getContact()
                    + "' where rollnumber = '" + student.getRollNo() + "'";
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Student updated successfully.");
            stmt.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public void deleteStudent(String rollNo) {
        Connection con = DBConnection.getDbConnection();
        try {
            Statement stmt = con.createStatement();
            String sql = "delete from students where rollnumber = '" + rollNo + "'";
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Student deleted successfully.");
            stmt.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    
    @Override
    public List<Student> getAllStudents() {
        List<Student> list = new ArrayList<>();
        Connection con = DBConnection.getDbConnection();
        try {
            Statement stmt = con.createStatement();
            String sql = "select * from students";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Student s = new Student();
                s.setName(rs.getString("name"));
                s.setAge(rs.getInt("age"));
                s.setStudentClass(rs.getString("name_c"));
                s.setRollNo(rs.getString("rollnumber"));
                s.setGender(rs.getString("gender"));
                s.setAddress(rs.getString("address"));
                s.setContact(rs.getString("contact"));
                list.add(s);
            }
            stmt.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            e.printStackTrace();
        }
        return list;
    }
}


