package com.Student.API_STREAM.StudentManagementSystem;

import java.util.stream.Collectors;
import java.util.*;

public class Test {
    public static void main(String[] args) {
            List<Student> students = new ArrayList<>();
            students.add(new Student("Habib", 85, "Math"));
            students.add(new Student("Fatima", 75, "Science"));
            students.add(new Student("Zafar", 92, "Math"));
            students.add(new Student("Haseeb", 65, "English"));
            students.add(new Student("Shahzad", 88, "History"));

            System.out.println("=================Student Management System================");
            System.out.println();
            System.out.println("Students with marks >= 80:");
        students.stream()
                .filter(student -> student.getMarks() >= 80)
                .forEach(student -> student.displayInfo());

        System.out.println("------------Students sorted by marks (Descending)--------------");

        students.stream()
                .sorted((s1, s2) -> Integer.compare(s2.getMarks(), s1.getMarks()))
                .forEach(student -> student.displayInfo());

        System.out.println("---------Students' Grades---------");
            students.stream()
                    .map(student -> {
                        System.out.println(student.getName() + " : " + student.getGrade());
                        return student;
                    })
                    .collect(Collectors.toList());
    }
}

