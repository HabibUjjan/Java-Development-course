import java.util.Scanner;
class Employee {
    String name;
    String address;
    double salary;
    String jobTitle;
    public void calculateBonus() {
        System.out.println("Bonus calculation not defined for generic employee");
    }

    public void generatePerformanceReport() {
        System.out.println("Performance report not defined for generic employee");
    }

    public void manageProject() {
        System.out.println("Project management not defined for generic employee");
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
        System.out.println("Job Title: " + jobTitle);
    }
}
class Manager extends Employee {
    @Override
    public void calculateBonus() {
        double bonus = salary * 0.10;
        System.out.println("Manager's bonus: " + bonus);
    }

    @Override
    public void generatePerformanceReport() {
        System.out.println("Manager's performance report generated.");
    }

    @Override
    public void manageProject() {
        System.out.println("Manager is managing the project.");
    }
}
class Developer extends Employee {
    @Override
    public void calculateBonus() {
        double bonus = salary * 0.08;
        System.out.println("Developer's bonus: " + bonus);
    }
    @Override
    public void generatePerformanceReport() {
        System.out.println("Developer's performance report generated.");
    }
    @Override
    public void manageProject() {
        System.out.println("Developer is managing the project.");
    }
}
class Programmer extends Employee {
    @Override
    public void calculateBonus() {
        double bonus = salary * 0.05;
        System.out.println("Programmer's bonus: " + bonus);
    }
    @Override
    public void generatePerformanceReport() {
        System.out.println("Programmer's performance report generated.");
    }
    @Override
    public void manageProject() {
        System.out.println("Programmer is managing the project.");
    }
}
class CompanyDetails{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Manager manager = new Manager();
        Developer developer = new Developer();
        Programmer programmer = new Programmer();

        System.out.println("Enter Manager Details:");
        System.out.print("Name: ");
        manager.name = s.nextLine();
        System.out.print("Address: ");
        manager.address = s.nextLine();
        System.out.print("Salary: ");
        manager.salary = s.nextDouble();
        s.nextLine();
        System.out.print("Job Title: ");
        manager.jobTitle = s.nextLine();

        System.out.println("\nEnter Developer Details:");
        System.out.print("Name: ");
        developer.name = s.nextLine();
        System.out.print("Address: ");
        developer.address = s.nextLine();
        System.out.print("Salary: ");
        developer.salary = s.nextDouble();
        s.nextLine(); 
        System.out.print("Job Title: ");
        developer.jobTitle = s.nextLine();

        
        System.out.println("\nEnter Programmer Details:");
        System.out.print("Name: ");
        programmer.name = s.nextLine();
        System.out.print("Address: ");
        programmer.address = s.nextLine();
        System.out.print("Salary: ");
        programmer.salary = s.nextDouble();
        s.nextLine(); 
        System.out.print("Job Title: ");
        programmer.jobTitle = s.nextLine();

        System.out.println("Manager Details:");
        manager.displayDetails();
        manager.calculateBonus();
        manager.generatePerformanceReport();
        manager.manageProject();

        System.out.println("Developer Details:");
        developer.displayDetails();
        developer.calculateBonus();
        developer.generatePerformanceReport();
        developer.manageProject();

        System.out.println("Programmer Details:");
        programmer.displayDetails();
        programmer.calculateBonus();
        programmer.generatePerformanceReport();
        programmer.manageProject();
        
    }
}
