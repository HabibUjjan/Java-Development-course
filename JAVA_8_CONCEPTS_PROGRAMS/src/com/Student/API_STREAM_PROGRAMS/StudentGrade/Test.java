package com.Student.API_STREAM.StudentGrade;

import java.util.*;
public class Test {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Habib",90));
        students.add(new Student("Ali",60));
        students.add(new Student("Alina",76));
        students.add(new Student("Hameed",88));

        System.out.println("===================Sorted Students by Marks===================");
        students.stream()
                .sorted((s1, s2) -> Integer.compare(s2.getMarks(), s1.getMarks()))  // Sort by marks descending
                .forEach(student -> student.displayInfo());


    }
}
