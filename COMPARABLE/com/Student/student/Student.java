package com.Student.student;

public class Student implements Comparable<Student> {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student student) {
        int nameCompare = this.name.compareTo(student.name);
        if (nameCompare != 0) {
            return nameCompare;
        } else {
            return this.marks - student.marks;
        }
    }

    @Override
    public String toString() {
        return "Student: " + name + ", Marks: " + marks;
    }
}

