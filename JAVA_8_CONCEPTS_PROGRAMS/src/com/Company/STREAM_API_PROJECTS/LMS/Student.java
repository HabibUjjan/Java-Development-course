package com.Studennt.STREAM_API_PROJECTS.LMS;


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

    public int getStudentId() {
        return studentId;
    }

    public void showStudentData() {
        System.out.println(studentId + "     " + studentName + "     " + rollNumber + "     " + issuedBookIban);
    }
}

