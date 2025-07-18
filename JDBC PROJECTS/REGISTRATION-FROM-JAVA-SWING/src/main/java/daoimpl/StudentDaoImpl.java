/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daoimpl;

import dao.StudentDao;
import database.DBConnection;
import java.sql.Connection;
import java.sql.Statement;
import model.Registration;


/**
 *
 * @author HABIB
 */
public class StudentDaoImpl implements StudentDao{
     Connection connection = DBConnection.getDbConnection();
    public int addRegistration(Registration student) {
        try {
        Statement statement = connection.createStatement();
        String query = "insert into Registration (name, email, password, gender, phone, city, course) values ('"
                + student.getName() + "', '"
                + student.getEmail() + "', '"
                + student.getPassword() + "', '"
                + student.getGender() + "', '"
                + student.getPhone() + "', '"
                + student.getCity() + "', '"
                + student.getCourse() + "')";
        return statement.executeUpdate(query);
    } catch (Exception e) {
        throw new RuntimeException(e);
    }   
    } 
 
}
