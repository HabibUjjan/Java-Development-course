package com.Student.SMS;
import java.util.*;

public class StudentManager {
    ArrayList<Student> students = new ArrayList<>();
    DepartmentManager deptManager;

    StudentManager(DepartmentManager deptManager) {
        this.deptManager = deptManager;
    }

    void addStudent(int id, String name, String rollNo, String departmentCode) {
        if (deptManager.isDepartmentExist(departmentCode)) {
            students.add(new Student(id, name, rollNo, departmentCode));
            System.out.println("Student added successfully");
        } else {
            System.out.println("Department not found");

        }
        System.out.println();
    }

    void updateStudent(int id, String newName, String newRollNo, String newDepartmentCode) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).id == id) {
                students.get(i).name = newName;
                students.get(i).rollNo = newRollNo;
                students.get(i).departmentCode = newDepartmentCode;
                System.out.println("Student updated successfully");
                System.out.println();
                return;

            }
        }
        System.out.println("Student not found");
        System.out.println();
    }

    void deleteStudent(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).id == id) {
                students.remove(i);
                System.out.println("Student deleted successfully");
                System.out.println();
                return;
            }
        }
        System.out.println("Student not found");
    }

    void getStudent(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).id == id) {
                students.get(i).displayInfo();
                System.out.println();
                return;
            }
        }
        System.out.println("Student not found");
    }

    void displayAllStudents() {
        for (int i = 0; i < students.size(); i++) {
            students.get(i).displayInfo();
            System.out.println();
        }
    }
}

