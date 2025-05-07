package com.Studennt.STREAM_API_PROJECTS.SMS;


public class Student {
    int id;
    String name;
    String rollNo;
    String departmentCode;

    Student(int id, String name, String rollNo, String departmentCode) {
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
        this.departmentCode = departmentCode;
    }

    void displayInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Department: " + departmentCode);
    }
}

