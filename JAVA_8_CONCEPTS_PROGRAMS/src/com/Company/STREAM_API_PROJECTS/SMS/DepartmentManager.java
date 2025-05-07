package com.Studennt.STREAM_API_PROJECTS.SMS;

import java.util.*;

public class DepartmentManager {
    ArrayList<Department> departments = new ArrayList<>();

    void addDepartment(String name, String code) {
        departments.add(new Department(name, code));
        System.out.println("Department added successfully");
        System.out.println();
    }

    boolean isDepartmentExist(String code) {
        return departments.stream().anyMatch(dept -> dept.code.equals(code));
    }

    void updateDepartment(String code, String newName, String newCode) {
        departments.stream()
                .filter(dept -> dept.code.equals(code))
                .findFirst()
                .ifPresentOrElse(dept -> {
                    dept.name = newName;
                    dept.code = newCode;
                    System.out.println("Department updated successfully");
                    System.out.println();
                }, () -> System.out.println("Department not found"));
    }

    void deleteDepartment(String code) {
        if (departments.removeIf(dept -> dept.code.equals(code))) {
            System.out.println("Department deleted successfully");
            System.out.println();
        } else {
            System.out.println("Department not found");
        }
    }

    void getDepartment(String code) {
        departments.stream()
                .filter(dept -> dept.code.equals(code))
                .findFirst()
                .ifPresentOrElse(dept -> {
                    dept.displayInfo();
                    System.out.println();
                }, () -> System.out.println("Department not found"));
    }

    void displayAllDepartments() {
        departments.stream().forEach(dept -> dept.displayInfo());
    }
}

