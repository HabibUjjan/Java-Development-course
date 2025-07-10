package com.studentcompany.daoimpl;
import com.studentcompany.dao.DepartmentDao;
import com.studentcompany.database.DBConnection;
import com.studentcompany.model.Department;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DepartmentDaoImpl implements DepartmentDao {
    Connection connection = DBConnection.getDbConnection();
    @Override
    public int addDepartment(Department dept) {
        try {
            Statement statement = connection.createStatement();
            String insert = "insert into department (d_name, d_code) values ('" + dept.getName() + "','" + dept.getCode() + "')";
            int rows = statement.executeUpdate(insert);
            return rows;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int deleteDepartmentByCode(String code) {
        try {
            Statement statement = connection.createStatement();
            String delete = "delete from department where d_code = '" + code + "'";
            int rows = statement.executeUpdate(delete);
            statement.close();
            return rows;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int updateDepartment(String code, Department dept) {
        try {
            Statement statement = connection.createStatement();
            String update = "update department set d_name = '" + dept.getName() + "' where d_code = '" + code + "'";
            int rows = statement.executeUpdate(update);
            statement.close();
            return rows;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void showAllDepartments() {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from department");
            while (resultSet.next()) {
                System.out.println("Department Name: " + resultSet.getString("d_name"));
                System.out.println("Department Code: " + resultSet.getString("d_code"));
                System.out.println("------------------------");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
