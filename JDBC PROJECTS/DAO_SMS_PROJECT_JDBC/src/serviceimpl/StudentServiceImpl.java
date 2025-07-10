package serviceimpl;
import dao.StudentDao;
import daoimpl.StudentDaoImpl;
import model.Student;
import service.StudentService;
import java.util.Scanner;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao = new StudentDaoImpl();
    @Override
    public void showStudentMenu(Scanner sc) {
        while (true) {
            System.out.println("--- STUDENT MENU ---");
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Update Student");
            System.out.println("4. Show All Students");
            System.out.println("5. Back");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Roll Number: ");
                String roll = sc.nextLine();
                System.out.print("Enter Age: ");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Department: ");
                String dept = sc.nextLine();
                int result = studentDao.addStudent(new Student(name, roll, age, dept));
                if (result > 0) {
                    System.out.println("Student added successfully.");
                } else {
                    System.out.println("Failed to add student.");
                }

            } else if (choice == 2) {
                System.out.print("Enter Roll Number to Delete: ");
                String roll = sc.nextLine();
                int result = studentDao.deleteStudentByRollNumber(roll);
                if (result > 0) {
                    System.out.println("Student deleted successfully.");
                } else {
                    System.out.println("Student not found.");
                }

            } else if (choice == 3) {
                System.out.print("Enter Roll Number to Update: ");
                String roll = sc.nextLine();
                System.out.print("Enter New Name: ");
                String name = sc.nextLine();
                System.out.print("Enter New Age: ");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter New Department: ");
                String dept = sc.nextLine();
                int result = studentDao.updateStudent(roll, new Student(name, roll, age, dept));
                if (result > 0) {
                    System.out.println("Student updated successfully.");
                } else {
                    System.out.println("Student not found.");
                }

            } else if (choice == 4) {
                studentDao.showAllStudents();

            } else if (choice == 5) {
                break;

            } else {
                System.out.println("Invalid option. Try again.");
            }

            System.out.println();
        }
    }
}
