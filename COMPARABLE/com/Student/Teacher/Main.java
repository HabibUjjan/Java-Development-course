package com.Student.Teacher;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Teacher> teachers = new ArrayList<>();

        teachers.add(new Teacher("Mr. Ali", 50000));
        teachers.add(new Teacher("Mrs. Sara", 55000));
        teachers.add(new Teacher("Mr. John", 45000));
        teachers.add(new Teacher("Ms. Zainab", 48000));
        teachers.add(new Teacher("Mr. Ali", 53000));

        System.out.println("---------------Original List---------------");
        System.out.println(teachers);


        Collections.sort(teachers);
        System.out.println("---------------Sorted List---------------");
        System.out.println(teachers);


        Teacher highestSalary = Collections.max(teachers);
        System.out.println("Teacher with the highest salary: " + highestSalary);


        Teacher lowestSalary = Collections.min(teachers);
        System.out.println("Teacher with the lowest salary: " + lowestSalary);
    }


    public static void printList(ArrayList<Teacher> list) {
        for (Teacher teacher : list) {
            System.out.println(teacher);
        }
    }
}
