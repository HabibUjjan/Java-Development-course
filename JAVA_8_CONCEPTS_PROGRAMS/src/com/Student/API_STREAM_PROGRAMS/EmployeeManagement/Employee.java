package com.Student.API_STREAM.EmployeeManagement;

class Employee {
    private String name;
    private double salary;
    private String department;

    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public double applyBonus() {
        if (salary > 60000) {
            return salary * 1.10;
        } else if (salary > 40000) {
            return salary * 1.05;
        } else {
            return salary;
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println("Salary after Bonus: " + applyBonus());
        System.out.println();
    }
}
