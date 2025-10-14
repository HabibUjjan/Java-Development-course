package com.student.dao;

import com.student.model.Student;
import java.util.List;


public interface StudentDao {
    void addStudent(Student student);
    Student getStudentById(int id);
    List<Student> getAllStudents();
    void updateStudent(Student student);
    void deleteStudent(int id);
}
