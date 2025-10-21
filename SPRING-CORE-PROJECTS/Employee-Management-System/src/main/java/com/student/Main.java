package com.student;

import com.student.config.AppConfig;
import com.student.dao.EmployeeDao;
import com.student.model.Employee;
import org.springframework.context.ApplicationContext;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new org.springframework.context.annotation.AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeDao employeeDao = context.getBean(EmployeeDao.class);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("***** Employee Management System *****");
            System.out.println("1. Add Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. Get Employee by ID");
            System.out.println("5. Get All Employees");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
              switch (choice) {
                  case 1:
                      System.out.print("Enter Name: ");
                      scanner.nextLine();
                      String name = scanner.nextLine();
                      System.out.print("Enter Department: ");
                      String dept = scanner.nextLine();
                      System.out.print("Enter Salary: ");
                      double sal = scanner.nextDouble();
                      Employee emp1 = new Employee(0, name, dept, sal);
                      employeeDao.addEmployee(emp1);
                      System.out.println("Employee Added Successfully!");
                      System.out.println();
                      break;
                  case 2:
                      System.out.print("Enter ID to Update: ");
                      int uid = scanner.nextInt();
                      scanner.nextLine();
                      System.out.print("Enter New Name: ");
                      String newName = scanner.nextLine();
                      System.out.print("Enter New Department: ");
                      String newDept = scanner.nextLine();
                      System.out.print("Enter New Salary: ");
                      double newSal = scanner.nextDouble();
                      Employee emp2 = new Employee(uid, newName, newDept, newSal);
                      employeeDao.updateEmployee(emp2);
                      System.out.println("Employee Updated Successfully!");
                      System.out.println();
                      break;
                  case 3:
                      System.out.print("Enter ID to Delete: ");
                      int did = scanner.nextInt();
                      employeeDao.deleteEmployee(did);
                      System.out.println("🗑 Employee Deleted Successfully!");
                      System.out.println();
                      break;
                  case 4:
                      System.out.print("Enter ID to Search: ");
                      int sid = scanner.nextInt();
                      Employee e = employeeDao.getEmployeeById(sid);
                      System.out.println("Employee Found:");
                      e.displayInfo();
                      break;
                  case 5:
                      System.out.println("All Employees:");
                      List<Employee> list = employeeDao.getAllEmployees();
                      for (Employee emp : list) {
                          emp.displayInfo();
                            }
                      System.out.println();
                      break;

                  case 6:
                      System.out.println("Exiting.");
                      System.exit(0);
                      break;
                      default:
                          System.out.println("Invalid Choice");
                    }
                }
            }
        }
