package com.student.dao;


import com.student.model.Student;
import java.util.List;

public interface StudentDao {
    void insert(Student student) throws Exception;
    void update(Student student) throws Exception;
    void delete(String rollNumber) throws Exception;
    List<Student> getAll() throws Exception;
    Student getByRollNumber(String rollNumber) throws Exception;
}


