import java.util.Scanner;

class Employees {
    protected String name;
    protected int id;
    protected double salary;
    protected String department;

    public Employees(String name, int id, double salary, String department) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
    }

    public void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}

class CEO extends Employees {
    private String companyName;

    public CEO(String name, int id, double salary, String department, String companyName) {
        super(name, id, salary, department);
        this.companyName = companyName;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Company: " + companyName);
        System.out.println("Role: CEO");
    }
}

class Manager extends Employees {
    private String team;

    public Manager(String name, int id, double salary, String department, String team) {
        super(name, id, salary, department);
        this.team = team;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Team: " + team);
        System.out.println("Role: Manager");
    }
}

class AssistantManager extends Employees {
    private String areaOfSupervision;

    public AssistantManager(String name, int id, double salary, String department, String areaOfSupervision) {
        super(name, id, salary, department);
        this.areaOfSupervision = areaOfSupervision;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Area of Supervision: " + areaOfSupervision);
        System.out.println("Role: Assistant Manager");
    }
}

class Supervisor extends Employees {
    private int numberOfEmployeesSupervised;

    public Supervisor(String name, int id, double salary, String department, int numberOfEmployeesSupervised) {
        super(name, id, salary, department);
        this.numberOfEmployeesSupervised = numberOfEmployeesSupervised;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Number of Employees Supervised: " + numberOfEmployeesSupervised);
        System.out.println("Role: Supervisor");
    }
}

public class CompanyHierarchy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employees[] employees = new Employees[4];

        System.out.println("Enter CEO details:");
        System.out.print("Name: ");
        String ceoName = sc.nextLine();
        System.out.print("ID: ");
        int ceoId = sc.nextInt();
        System.out.print("Salary: ");
        double ceoSalary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Department: ");
        String ceoDepartment = sc.nextLine();
        System.out.print("Company Name: ");
        String companyName = sc.nextLine();

        employees[0] = new CEO(ceoName, ceoId, ceoSalary, ceoDepartment, companyName);

        System.out.println("Enter Manager details:");
        System.out.print("Name: ");
        String managerName = sc.nextLine();
        System.out.print("ID: ");
        int managerId = sc.nextInt();
        System.out.print("Salary: ");
        double managerSalary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Department: ");
        String managerDepartment = sc.nextLine();
        System.out.print("Team: ");
        String team = sc.nextLine();

        employees[1] = new Manager(managerName, managerId, managerSalary, managerDepartment, team);

        System.out.println("Enter Assistant Manager details:");
        System.out.print("Name: ");
        String assistantManagerName = sc.nextLine();
        System.out.print("ID: ");
        int assistantManagerId = sc.nextInt();
        System.out.print("Salary: ");
        double assistantManagerSalary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Department: ");
        String assistantManagerDepartment = sc.nextLine();
        System.out.print("Area of Supervision: ");
        String areaOfSupervision = sc.nextLine();

        employees[2] = new AssistantManager(assistantManagerName, assistantManagerId, assistantManagerSalary, assistantManagerDepartment, areaOfSupervision);

        System.out.println("Enter Supervisor details:");
        System.out.print("Name: ");
        String supervisorName = sc.nextLine();
        System.out.print("ID: ");
        int supervisorId = sc.nextInt();
        System.out.print("Salary: ");
        double supervisorSalary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Department: ");
        String supervisorDepartment = sc.nextLine();
        System.out.print("Number of Employees Supervised: ");
        int numberOfEmployeesSupervised = sc.nextInt();

        employees[3] = new Supervisor(supervisorName, supervisorId, supervisorSalary, supervisorDepartment, numberOfEmployeesSupervised);

        System.out.println("**********Displaying all Employee Information**********");
        for (int i = 0; i < employees.length; i++) {
            employees[i].displayInformation();
            System.out.println();
        }
    }
}
