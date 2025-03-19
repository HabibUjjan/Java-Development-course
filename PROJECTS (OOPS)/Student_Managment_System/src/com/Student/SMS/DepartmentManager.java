package com.Student.SMS;
import java.util.*;

public class DepartmentManager {
    ArrayList<Department> departments = new ArrayList<>();

    void addDepartment(String name, String code) {
        departments.add(new Department(name, code));
        System.out.println("Department added successfully");
        System.out.println();
    }

    boolean isDepartmentExist(String code) {
        for (int i = 0; i < departments.size(); i++) {
            if (departments.get(i).code.equals(code)) {
                return true;
            }
        }
        return false;
    }

    void updateDepartment(String code, String newName, String newCode) {
        for (int i = 0; i < departments.size(); i++) {
            if (departments.get(i).code.equals(code)) {
                departments.get(i).name = newName;
                departments.get(i).code = newCode;
                System.out.println("Department updated successfully");
                System.out.println();
                return;
            }
        }
        System.out.println("Department not found");

    }

    void deleteDepartment(String code) {
        for (int i = 0; i < departments.size(); i++) {
            if (departments.get(i).code.equals(code)) {
                departments.remove(i);
                System.out.println("Department deleted successfully");
                System.out.println();
                return;
            }
        }
        System.out.println("Department not found");


    }


    void getDepartment(String code) {
        for (int i = 0; i < departments.size(); i++) {
            if (departments.get(i).code.equals(code)) {
                departments.get(i).displayInfo();
                System.out.println();
                return;
            }
        }
        System.out.println("Department not found");

    }


    void displayAllDepartments() {
        for (int i = 0; i < departments.size(); i++) {
            departments.get(i).displayInfo();
        }

    }
}

