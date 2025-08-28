package com.student.daoimpl;
import com.student.dao.StudentDao;
import com.student.database.DBConnection;
import com.student.model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDaoImpl implements StudentDao {
    @Override
    public void addStudent(Student student) {
        Connection connection = DBConnection.getDbConnection();
        try {
            String query = "insert into students (name, age, roll_number, gender, course, department) values (?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, student.getName());
            preparedStatement.setInt(2, student.getAge());
            preparedStatement.setString(3, student.getRollNumber());
            preparedStatement.setString(4, student.getGender());
            preparedStatement.setString(5, student.getCourse());
            preparedStatement.setString(6, student.getDepartment());
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
