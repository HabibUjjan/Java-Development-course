package com.student.Student;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        System.out.println("**************STUDENT'S DATA INFORMATION**************");
        studentList.add(new Student("Habib","123",23,"SMIU"));
        studentList.add(new Student("Ahmed","124",22,"SMIU"));
        studentList.add(new Student("Ali","125",21,"SMIU"));
        studentList.add(new Student("Zain","126",24,"SMIU"));
        studentList.add(new Student("Usman","127",23,"SMIU"));
        studentList.add(new Student("Omar","128",25,"SMIU"));
        studentList.add(new Student("Sara","129",22,"SMIU"));
        studentList.add(new Student("Fatima","130",21,"SMIU"));
        studentList.add(new Student("Ayesha","131",23,"SMIU"));
        studentList.add(new Student("Bilal","132",24,"SMIU"));


        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            student.displayStudentInfo();
            System.out.println();
        }
    }
}