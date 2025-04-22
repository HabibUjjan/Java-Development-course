package com.Student.student;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ali", 85));
        students.add(new Student("Sara", 92));
        students.add(new Student("John", 70));
        students.add(new Student("Ali", 90));
        students.add(new Student("Zara", 80));

        System.out.println("---------------Original List---------------");
        System.out.println(students);


        Collections.sort(students);
        System.out.println("---------------Sorted List---------------");
        System.out.println(students);


        Student highestMarks = Collections.max(students);
        System.out.println("Student with the highest marks: " + highestMarks);


        Student lowestMarks = Collections.min(students);
        System.out.println("Student with the lowest marks: " + lowestMarks);
    }

    public static void printList(ArrayList<Student> list) {
        for (Student student : list) {
            System.out.println(student);
        }
    }
}

