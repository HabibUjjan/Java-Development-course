package com.student.Teacher;

public class Teacher {
    private String name;
    private String subject;
    private double salary;
    private int experience;
    private String department;

     Teacher(String name, String subject, double salary, int experience, String department) {
        this.name = name;
        this.subject = subject;
        this.salary = salary;
        this.experience = experience;
        this.department = department;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
        System.out.println("Experience: " + experience + " years");
        System.out.println("Department: " + department);

    }
}

