package com.student.Student;

public class Student {
    private String name;
    private int age;
    private String id;
    private String department;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return this.department;
    }

    public void displayInfo(){
        System.out.println("Name: " + this.getName());
        System.out.println("Age: " + this.getAge());
        System.out.println("ID: " + this.getId());
        System.out.println("Department: " + this.getDepartment());


    }
}
