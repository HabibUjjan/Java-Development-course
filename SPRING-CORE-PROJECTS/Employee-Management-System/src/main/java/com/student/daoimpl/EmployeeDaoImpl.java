package com.student.daoimpl;

import com.student.dao.EmployeeDao;
import com.student.mapper.EmployeeMapper;
import com.student.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeDaoImpl implements EmployeeDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public int addEmployee(Employee emp) {
        String sql = "INSERT INTO employee VALUES(?,?,?,?)";
        return jdbcTemplate.update(sql, emp.getId(), emp.getName(), emp.getDepartment(), emp.getSalary());

    }

    @Override
    public int updateEmployee(Employee emp) {
        String sql = "UPDATE employee SET name=?, department=?, salary=? WHERE id=?";
        return jdbcTemplate.update(sql, emp.getName(), emp.getDepartment(), emp.getSalary(), emp.getId());

    }

    @Override
    public int deleteEmployee(int id) {
       String sql = "DELETE FROM employee WHERE id=?";
        return jdbcTemplate.update(sql, id);
    }

    @Override
    public Employee getEmployeeById(int id) {
        String sql = "SELECT * FROM employee WHERE id=?";
        return jdbcTemplate.queryForObject(sql, employeeMapper, id);
    }

    @Override
    public List<Employee> getAllEmployees() {
        String sql = "SELECT * FROM employee";
        return jdbcTemplate.query(sql, employeeMapper);
    }
}
