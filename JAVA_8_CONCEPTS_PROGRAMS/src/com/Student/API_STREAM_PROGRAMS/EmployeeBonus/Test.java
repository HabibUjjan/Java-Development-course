package com.Student.API_STREAM.EmployeeBonus;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
                List<Employee> employees = new ArrayList<>();
                employees.add(new Employee("Karim", 50000, "Excellent"));
                employees.add(new Employee("Adil", 40000, "Good"));
                employees.add(new Employee("Shahzad", 35000, "Average"));
                employees.add(new Employee("Kanwal", 60000, "Excellent"));
                employees.add(new Employee("Haseena", 45000, "Good"));

                System.out.println("===================Employee Bonus Details===================");
                System.out.println();
                employees.stream()
                        .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))  // Sorting based on salary in descending order
                        .forEach(employee -> {
                            employee.displayInfo();
                        }
                        );
            }
    }

