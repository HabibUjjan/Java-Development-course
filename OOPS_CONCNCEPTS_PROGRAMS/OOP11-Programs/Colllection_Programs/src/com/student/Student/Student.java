package com.student.Student;

public class Student {
    private String name;
    private String rollNumber;
    private int age;
    private String university;

    Student(String name,String rollNumber,int age, String university){
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
        this.university = university;

    }

     void displayStudentInfo(){
        System.out.println("Name: "+name);
        System.out.println("RollNumber: "+rollNumber);
        System.out.println("Age: "+age);
        System.out.println("University: "+university);
    }


}
