package com.Student.API_STREAM.EmployeeManagement;
import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Habib", 65000, "IT"));
        employees.add(new Employee("Huzafia", 45000, "HR"));
        employees.add(new Employee("Muqeet", 38000, "Finance"));
        employees.add(new Employee("Karim", 75000, "IT"));
        employees.add(new Employee("Aishaa", 52000, "Marketing"));
        System.out.println("==============Employee Salary Management System===============");

        employees.stream()
                .filter(e -> e.getSalary() > 40000)
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .map(employee -> {
                    employee.displayInfo();
                    return employee;
                })
                .collect(Collectors.toList());
    }
}
