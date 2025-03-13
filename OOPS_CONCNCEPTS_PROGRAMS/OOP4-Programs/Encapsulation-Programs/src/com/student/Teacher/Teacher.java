package com.student.Teacher;

public class Teacher {
   private String name;
   private int age;
   private String subject;
   private String schoolName;

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

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return this.schoolName;
    }

    public void displayInfo(){
        System.out.println("Name: " + this.getName());
        System.out.println("Age: " + this.getAge());
        System.out.println("Subject: " + this.getSubject());
        System.out.println("School Name: " + this.getSchoolName());
    }
}
