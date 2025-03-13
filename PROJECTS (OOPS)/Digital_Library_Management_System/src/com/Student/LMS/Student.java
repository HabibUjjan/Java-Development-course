package com.Student.LMS;

public class Student {
    int studentId;
    String studentName;
    String rollNumber;
    String issuedBookIban;

    public Student(int studentId, String studentName, String rollNumber, String issuedBookIban) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.issuedBookIban = issuedBookIban;
    }

    
    public void showStudentData() {
        System.out.println(studentId + "     " + studentName + "     " + rollNumber + "     " + issuedBookIban);
    }
}
