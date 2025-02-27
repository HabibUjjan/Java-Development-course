import java.util.Scanner;
class HeadOfDepartment {
    protected String name;
    protected String departmentName;
    protected int id;
    protected String contactNumber;

    public HeadOfDepartment(String name, String departmentName, int id, String contactNumber) {
        this.name = name;
        this.departmentName = departmentName;
        this.id = id;
        this.contactNumber = contactNumber;
    }

    public void displayInformation() {
        System.out.println("Head of Department Information:");
        System.out.println("Name: " + name);
        System.out.println("Department: " + departmentName);
        System.out.println("ID: " + id);
        System.out.println("Contact Number: " + contactNumber);
    }
}

class Coordinator extends HeadOfDepartment {
    protected String coordinatorRole;
    protected int coordinatorId;

    public Coordinator(String name, String departmentName, int id, String contactNumber, String coordinatorRole, int coordinatorId) {
        super(name, departmentName, id, contactNumber);
        this.coordinatorRole = coordinatorRole;
        this.coordinatorId = coordinatorId;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Coordinator Role: " + coordinatorRole);
        System.out.println("Coordinator ID: " + coordinatorId);
    }
}

class Faculties extends Coordinator {
    protected String facultyName;
    protected String subjectTaught;

    Faculties(String name, String departmentName, int id, String contactNumber, String coordinatorRole, int coordinatorId, String facultyName, String subjectTaught) {
        super(name, departmentName, id, contactNumber, coordinatorRole, coordinatorId);
        this.facultyName = facultyName;
        this.subjectTaught = subjectTaught;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Faculty Name: " + facultyName);
        System.out.println("Subject Taught: " + subjectTaught);
    }
}

class Students extends Faculties {
    protected String studentName;
    protected String studentId;

    Students(String name, String departmentName, int id, String contactNumber, String coordinatorRole, int coordinatorId, 
                    String facultyName, String subjectTaught, String studentName, String studentId) {
        super(name, departmentName, id, contactNumber, coordinatorRole, coordinatorId, facultyName, subjectTaught);
        this.studentName = studentName;
        this.studentId = studentId;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentId);
    }
}

public class UniversityHierarchy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HeadOfDepartment[] people = new HeadOfDepartment[4];

        System.out.println("Enter Head of Department Information:");
        System.out.print("Name: ");
        String hName = sc.nextLine();
        System.out.print("Department Name: ");
        String deptName = sc.nextLine();
        System.out.print("ID: ");
        int hId = sc.nextInt();
        sc.nextLine();  
        System.out.print("Contact Number: ");
        String hContact = sc.nextLine();

        people[0] = new HeadOfDepartment(hName, deptName, hId, hContact);

        System.out.println("Enter Coordinator Information:");
        System.out.print("Coordinator Role: ");
        String coordRole = sc.nextLine();
        System.out.print("Coordinator ID: ");
        int coordId = sc.nextInt();
        sc.nextLine();

        people[1] = new Coordinator(hName, deptName, hId, hContact, coordRole, coordId);

        System.out.println("Enter Faculty Information:");
        System.out.print("Faculty Name: ");
        String fName = sc.nextLine();
        System.out.print("Subject Taught: ");
        String subject = sc.nextLine();

        people[2] = new Faculties(hName, deptName, hId, hContact, coordRole, coordId, fName, subject); 

        System.out.println("Enter Student Information:");
        System.out.print("Student Name: ");
        String sName = sc.nextLine();
        System.out.print("Student ID: ");
        String sId = sc.nextLine();

        people[3] = new Students(hName, deptName, hId, hContact, coordRole, coordId, fName, subject, sName, sId);

        System.out.println("**************Displaying all Information**************");
        for (int i = 0; i < people.length; i++) {
    	people[i].displayInformation();
        System.out.println();
       }

    }
}
