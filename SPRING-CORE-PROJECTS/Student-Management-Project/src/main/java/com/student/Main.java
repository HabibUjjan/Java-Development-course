package com.student;

import com.student.config.AppConfig;
import com.student.dao.StudentDao;
import com.student.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentDao studentDao = context.getBean(StudentDao.class);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("********* Student Management System *********");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. View Student by ID");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();
                    studentDao.addStudent(new Student(id, name, email));
                    System.out.println("Student added successfully!");
                    System.out.println();
                }
                case 2 -> {
                    System.out.println("All Students:");
                    List<Student> students = studentDao.getAllStudents();
                    if (students.isEmpty()) {
                        System.out.println("No students found");
                    } else {
                        for (Student student : students) {
                            student.displayInfo();
                            System.out.println("---------------------");
                        }
                    }
                }
                case 3 -> {
                    System.out.print("Enter ID to search: ");
                    int sid = sc.nextInt();
                    Student s = studentDao.getStudentById(sid);
                    if (s != null) {
                        System.out.println("Student found:");
                        s.displayInfo();
                    } else {
                        System.out.println("Student with ID " + sid + " not found");
                    }
                }
                case 4 -> {
                    System.out.print("Enter ID to update: ");
                    int uid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new Name: ");
                    String uname = sc.nextLine();
                    System.out.print("Enter new Email: ");
                    String uemail = sc.nextLine();
                    studentDao.updateStudent(new Student(uid, uname, uemail));
                    System.out.println("Student updated successfully!");
                    System.out.println();
                }
                case 5 -> {
                    System.out.print("Enter ID to delete: ");
                    int did = sc.nextInt();
                    studentDao.deleteStudent(did);
                    System.out.println("Student deleted successfully!");
                    System.out.println();
                }
                case 6 -> {
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}
