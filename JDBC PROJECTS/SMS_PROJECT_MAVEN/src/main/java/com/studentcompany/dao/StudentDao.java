package com.studentcompany.dao;


import com.studentcompany.model.Student;

public interface StudentDao {
     int addStudent(Student student);
    public int deleteStudentByRollNumber(String rollNumber);
    public int updateStudent(String rollNumber, Student updatedStudent);
    public void showAllStudents();

}
