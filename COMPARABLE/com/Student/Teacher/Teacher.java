package com.Student.Teacher;

public class Teacher implements Comparable<Teacher> {
    String name;
    int salary;

    public Teacher(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Teacher teacher) {
        int nameCompare = this.name.compareTo(teacher.name);
        if (nameCompare != 0) {
            return nameCompare;
        } else {
            return this.salary - teacher.salary;
        }
    }

    @Override
    public String toString() {
        return "Teacher: Name = " + name + ", Salary = " + salary;
    }
}
