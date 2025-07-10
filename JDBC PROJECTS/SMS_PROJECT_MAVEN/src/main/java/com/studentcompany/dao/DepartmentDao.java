package com.studentcompany.dao;


import com.studentcompany.model.Department;

public interface DepartmentDao {
    int addDepartment(Department dept);
    int deleteDepartmentByCode(String code);
    int updateDepartment(String code, Department dept);
    void showAllDepartments();
}


