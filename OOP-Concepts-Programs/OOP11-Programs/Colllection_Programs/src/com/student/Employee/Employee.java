package com.student.Employee;

public class Employee {
    String eName;
    int eid;
    double salary;


    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name: '" + eName + '\'' +
                ",ID: " + eid +
                ", Salary: " + salary +
                '}';
    }
}
