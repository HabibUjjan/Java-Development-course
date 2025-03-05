package com.student.Employee;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        System.out.println("***********EMPLOYEE'S INFORMATION***********");
        Employee employee1 = new Employee();
        employee1.seteName("Habib");
        employee1.setEid(23);
        employee1.setSalary(670000);

        Employee employee2 = new Employee();
        employee2.seteName("Ali");
        employee2.setEid(24);
        employee2.setSalary(500000);
        employeeList.add(employee2);

        Employee employee3 = new Employee();
        employee3.seteName("Sara");
        employee3.setEid(25);
        employee3.setSalary(550000);
        employeeList.add(employee3);

        Employee employee4 = new Employee();
        employee4.seteName("Ahmed");
        employee4.setEid(26);
        employee4.setSalary(600000);
        employeeList.add(employee4);

        Employee employee5 = new Employee();
        employee5.seteName("Maya");
        employee5.setEid(27);
        employee5.setSalary(650000);
        employeeList.add(employee5);

        Employee employee6 = new Employee();
        employee6.seteName("Zain");
        employee6.setEid(28);
        employee6.setSalary(700000);
        employeeList.add(employee6);

        Employee employee7 = new Employee();
        employee7.seteName("Fatima");
        employee7.setEid(29);
        employee7.setSalary(720000);
        employeeList.add(employee7);

        Employee employee8 = new Employee();
        employee8.seteName("Usman");
        employee8.setEid(30);
        employee8.setSalary(630000);
        employeeList.add(employee8);

        Employee employee9 = new Employee();
        employee9.seteName("Khan");
        employee9.setEid(31);
        employee9.setSalary(750000);
        employeeList.add(employee9);

        Employee employee10 = new Employee();
        employee10.seteName("Nida");
        employee10.setEid(32);
        employee10.setSalary(680000);
        employeeList.add(employee10);

        for (int i = 0; i<employeeList.size(); i++){
         Employee employee = employeeList.get(i);
            System.out.println(employee);
            System.out.println();
        }
    }
}
