import java.util.Scanner;

public class Student {
    String studentID;
    String firstName;
    String lastName;
    String contact;
    String city;
    String dob;
    int currentSemester;
    int coursesEnrolled;

    Student(String studentID, String firstName, String lastName, String contact, 
            String city, String dob, int currentSemester, int coursesEnrolled) {

        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contact = contact;
        this.city = city;
        this.dob = dob;
        this.currentSemester = currentSemester;
        this.coursesEnrolled = coursesEnrolled;
    }

    void displayInfo() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Contact: " + contact);
        System.out.println("City: " + city);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Current Semester: " + currentSemester);
        System.out.println("Courses Enrolled: " + coursesEnrolled);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[8];

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details for student " + (i + 1));

            System.out.print("Enter Student ID: ");
            String studentID = scanner.nextLine();

            System.out.print("Enter First Name: ");
            String firstName = scanner.nextLine();

            System.out.print("Enter Last Name: ");
            String lastName = scanner.nextLine();

            System.out.print("Enter Contact: ");
            String contact = scanner.nextLine();

            System.out.print("Enter City: ");
            String city = scanner.nextLine();

            System.out.print("Enter Date of Birth (DD/MM/YYYY): ");
            String dob = scanner.nextLine();

            System.out.print("Enter Current Semester: ");
            int currentSemester = scanner.nextInt();

            System.out.print("Enter Number of Courses Enrolled: ");
            int coursesEnrolled = scanner.nextInt();
            scanner.nextLine(); 
            students[i] = new Student(studentID, firstName, lastName, contact, city, dob, currentSemester, coursesEnrolled);
        }

        System.out.println("**********STUDENT DETAILS**********");
        for (int i = 0; i < students.length; i++) {
            students[i].displayInfo();
        }
    }
}
