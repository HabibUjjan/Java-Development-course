package com.studentcompany.daoimpl;


import com.studentcompany.dao.StudentDao;
import com.studentcompany.database.DBConnection;
import com.studentcompany.model.Student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
public class StudentDaoImpl implements StudentDao {
    Connection connection = DBConnection.getDbConnection();
    @Override
    public int addStudent(Student student) {
        try {
            Statement statement = connection.createStatement();
            String query = "insert into student (s_name, s_rollNo, s_age, s_dept) values ('"+student.getName()+"','"+student.getRollNumber()+"','"+student.getAge()+"','"+student.getDept()+"')";
            return statement.executeUpdate(query);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public int deleteStudentByRollNumber(String rollNumber) {
        try {
            Statement statement = connection.createStatement();
            String delete = "delete from student where s_rollNo='" + rollNumber + "'";
            int rows = statement.executeUpdate(delete);
            if (rows > 0) {
                System.out.println("Student deleted successfully");
            } else {
                System.out.println("Student not found");
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return 0;
    }

    @Override
    public int updateStudent(String rollNumber, Student updatedStudent) {
        try {
            Statement statement = connection.createStatement();
            String query = "update student set s_name='" + updatedStudent.getName() + "', s_age='" + updatedStudent.getAge() + "', s_dept='" + updatedStudent.getDept() + "' where s_rollNo='" + rollNumber + "'";
            int rows = statement.executeUpdate(query);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return 0;
    }

    @Override
    public void showAllStudents() {
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from student");
            while (rs.next()) {
                System.out.println("Name: " + rs.getString("s_name"));
                System.out.println("Roll No: " + rs.getString("s_rollNo"));
                System.out.println("Age: " + rs.getInt("s_age"));
                System.out.println("Department: " + rs.getString("s_dept"));
                System.out.println("------------------------");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
       }
    }

