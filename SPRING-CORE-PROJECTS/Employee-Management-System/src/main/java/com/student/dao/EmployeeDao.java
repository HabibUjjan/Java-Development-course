package com.student.dao;


import com.student.model.Employee;

import java.util.List;

public interface EmployeeDao {
    int addEmployee(Employee emp);
    int updateEmployee(Employee emp);
    int deleteEmployee(int id);
    Employee getEmployeeById(int id);
    List<Employee> getAllEmployees();

}

