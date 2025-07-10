package database;

import model.Department;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class DepartmentDBManager {
    Connection connection = DBConnection.getDbConnection();

    public void addDepartment(Department dept) {
        try {
            Statement statement = connection.createStatement();
            String query = "insert into department (dept_name, dept_code) values ('"+dept.getName()+"','"+dept.getCode()+"')";
            int rows = statement.executeUpdate(query);
            if (rows>0){
                System.out.println("Department Added Successfully");
            }else {
                System.out.println("Invalid Data");
            }
            System.out.println();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteDepartmentByCode(String code) {
        try {
            Statement statement = connection.createStatement();
            String delete = "delete from department where dept_code='"+code + "'";
            int rows = statement.executeUpdate(delete);
            if (rows>0){
                System.out.println("Department deleted successfully");
            }else {
                System.out.println("Department not found");

            }
            System.out.println();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void updateDepartment(String code, Department updatedDept) {
        try {
            Statement statement = connection.createStatement();
            String query = "update department set dept_name='" + updatedDept.getName() + "' where dept_code='" + code + "'";
            int rows = statement.executeUpdate(query);
            if(rows>0){
                System.out.println("Department updated successfully");
            }
            else {
                System.out.println("Department not found");

            }
            System.out.println();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void showAllDepartments() {
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from department");
            while (rs.next()) {
                System.out.println("Name: " + rs.getString("dept_name"));
                System.out.println("Code: " + rs.getString("dept_code"));
                System.out.println("------------------------");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

