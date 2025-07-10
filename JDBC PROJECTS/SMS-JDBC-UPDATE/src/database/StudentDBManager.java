package database;

import model.Student;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
public class StudentDBManager {
    Connection connection = DBConnection.getDbConnection();
    public void addStudent(Student student) {
        try {
            Statement statement = connection.createStatement();
            String query = "insert into student (s_name, s_rollNo, s_age, s_dept) values ('"+student.getName()+"','"+student.getRollNumber()+"','"+student.getAge()+"','"+student.getDept()+"')";
            int rows = statement.executeUpdate(query);
            if (rows > 0) {
                System.out.println("Added Student Successfully!!");
            } else {
                System.out.println("Failed to add student");
            }
            System.out.println();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteStudentByRollNumber(String rollNumber) {
        try {
            Statement statement = connection.createStatement();
            String delete = "delete from student where s_rollNo='" + rollNumber + "'";
            int rows = statement.executeUpdate(delete);
            if (rows > 0) {
                System.out.println("Student deleted successfully");
            } else {
                System.out.println("Student not found");
            }
            System.out.println();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void updateStudent(String rollNumber, Student updatedStudent) {
        try {
            Statement statement = connection.createStatement();
            String query = "update student set s_name='" + updatedStudent.getName() + "', s_age='" + updatedStudent.getAge() + "', s_dept='" + updatedStudent.getDept() + "' where s_rollNo='" + rollNumber + "'";
            int rows = statement.executeUpdate(query);
            if (rows > 0) {
                System.out.println("Student updated successfully");
            } else {
                System.out.println("Student not found");
            }
            System.out.println();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

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
