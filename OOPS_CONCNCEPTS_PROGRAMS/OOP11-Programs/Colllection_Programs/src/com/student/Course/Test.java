package com.student.Course;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Course> courseList = new ArrayList<>();
        System.out.println("***********COURSE'S DETAILS***********");
        Course course1 = new Course();
        course1.setName("Java Programming");
        course1.setDuration(3);
        course1.setFees(15000);
        courseList.add(course1);

        Course course2 = new Course();
        course2.setName("Data Structures");
        course2.setDuration(4);
        course2.setFees(18000);
        courseList.add(course2);

        Course course3 = new Course();
        course3.setName("Machine Learning");
        course3.setDuration(6);
        course3.setFees(25000);
        courseList.add(course3);

        Course course4 = new Course();
        course4.setName("Web Development");
        course4.setDuration(5);
        course4.setFees(20000);
        courseList.add(course4);

        Course course5 = new Course();
        course5.setName("Database Management Systems");
        course5.setDuration(4);
        course5.setFees(22000);
        courseList.add(course5);


        Course course6 = new Course();
        course6.setName("Operating Systems");
        course6.setDuration(3);
        course6.setFees(15000);
        courseList.add(course6);

        Course course7 = new Course();
        course7.setName("Artificial Intelligence");
        course7.setDuration(6);
        course7.setFees(27000);
        courseList.add(course7);


        Course course8 = new Course();
        course8.setName("Computer Networks");
        course8.setDuration(4);
        course8.setFees(20000);
        courseList.add(course8);


        Course course9 = new Course();
        course9.setName("Cyber Security");
        course9.setDuration(5);
        course9.setFees(23000);
        courseList.add(course9);

        Course course10 = new Course();
        course10.setName("Cloud Computing");
        course10.setDuration(6);
        course10.setFees(26000);
        courseList.add(course10);

        for (int i = 0; i<courseList.size(); i++){
         Course course = courseList.get(i);
            System.out.println(course);
            System.out.println();
        }
    }
}
