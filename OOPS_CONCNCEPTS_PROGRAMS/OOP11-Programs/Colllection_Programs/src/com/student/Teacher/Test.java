package com.student.Teacher;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Teacher> teacherList = new ArrayList<>();
        System.out.println("************TEACHER'S INFORMATION************");
        teacherList.add(new Teacher("Habib Ujjan", "Java Programming", 55000, 8, "Computer Science"));
        teacherList.add(new Teacher("Fatima Ali", "Python Programming", 60000, 7, "Computer Science"));
        teacherList.add(new Teacher("Ali Mustafa", "Web Development", 50000, 5, "Computer Science"));
        teacherList.add(new Teacher("Ayesha Rehman", "Data Structures & Algorithms", 65000, 10, "Computer Science"));
        teacherList.add(new Teacher("Imran Shah", "Database Management Systems", 57000, 6, "Computer Science"));
        teacherList.add(new Teacher("Zainab Hussain", "Software Engineering", 62000, 9, "Computer Science"));
        teacherList.add(new Teacher("Omar Farooq", "C Programming", 54000, 4, "Computer Science"));
        teacherList.add(new Teacher("Maryam Bibi", "JavaScript Programming", 56000, 8, "Computer Science"));
        teacherList.add(new Teacher("Bilal Ahmed", "Mobile App Development", 59000, 7, "Computer Science"));
        teacherList.add(new Teacher("Hassan Raza", "Artificial Intelligence", 70000, 12, "Computer Science"));

        for (int i = 0; i<teacherList.size(); i++){
            Teacher teacher = teacherList.get(i);
            teacher.displayInfo();
            System.out.println();
        }
    }
}
