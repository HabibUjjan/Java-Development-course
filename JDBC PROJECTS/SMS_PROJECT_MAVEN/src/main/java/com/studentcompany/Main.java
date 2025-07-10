package com.studentcompany;


import com.studentcompany.service.DepartmentService;
import com.studentcompany.service.StudentService;
import com.studentcompany.serviceimpl.DepartmentServiceImpl;
import com.studentcompany.serviceimpl.StudentServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService studentService = new StudentServiceImpl();
        DepartmentService departmentService = new DepartmentServiceImpl();

        while (true) {
            System.out.println("************ Welcome to Student Management System ************");
            System.out.println("1. Student Management");
            System.out.println("2. Department Management");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int mainOpt = sc.nextInt();
            sc.nextLine();

            if (mainOpt == 1) {
                studentService.showStudentMenu(sc);
            } else if (mainOpt == 2) {
                departmentService.showDepartmentMenu(sc);
            } else if (mainOpt == 3) {
                System.out.println("Exiting... Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice");
            }

            System.out.println();
        }
    }
}

