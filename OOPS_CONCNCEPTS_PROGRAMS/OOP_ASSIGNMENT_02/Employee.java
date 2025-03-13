import java.util.Scanner;

public class Employee {
    int employeeNumber;
    float salary;
    Employee(int employeeNumber, float salary) {
        this.employeeNumber = employeeNumber;
        this.salary = salary;
    }

    void displayData() {
        System.out.println("Employee Number: " + employeeNumber);
        System.out.println("Employee Salary: " + salary);
	System.out.println();
    }

    public static void main(String[] args) {
	System.out.println("************Employee Details************");
        Employee[] employees = new Employee[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter employee number: ");
            int employeeNumber = scanner.nextInt();
            System.out.print("Enter employee salary: ");
            float salary = scanner.nextFloat();
            employees[i] = new Employee(employeeNumber, salary);
	    
        }
        for (int i = 0; i < 3; i++) {
            employees[i].displayData();
            System.out.println();
        }
    }
}
