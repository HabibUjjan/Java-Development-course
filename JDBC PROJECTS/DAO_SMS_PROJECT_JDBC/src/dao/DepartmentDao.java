package dao;
import model.Department;


public interface DepartmentDao {
    int addDepartment(Department dept);
    int deleteDepartmentByCode(String code);
    int updateDepartment(String code, Department dept);
    void showAllDepartments();
}


