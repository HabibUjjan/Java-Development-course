/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daoImpl;

import dao.DepartmentDao;
import database.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Course;
import model.Department;

/**
 *
 * @author HABIB
 */
public class DepartmentDaoImpl implements DepartmentDao{
   Connection connection = DBConnection.getDbConnection();
    @Override
    public List<Department> getAllDepartments() {
    List<Department> departments = new ArrayList<>();
    try {
        String query = "SELECT * FROM departments"; // ✅ departments table se data
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            departments.add(new Department(rs.getInt("id"), rs.getString("name")));
        }

    } catch (Exception e) {
        throw new RuntimeException(e);
    }
    return departments;
    }
}
