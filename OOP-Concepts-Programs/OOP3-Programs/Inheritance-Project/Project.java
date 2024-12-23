class Employee {
    String name;
    int age;
    String company;
    public void showEmployeeInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CompanyName: " + company);
    }
}

class Manager extends Employee {
    String department;
    public void showManagerInfo() {
        showEmployeeInfo(); 
        System.out.println("Manager's Department: " + department);
    }
}

class Developer extends Employee {
    String programmingLanguage;
    public void showDeveloperInfo() {
        showEmployeeInfo(); 
        System.out.println("Developer's Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    String internshipDuration;
    public void showInternInfo() {
        showEmployeeInfo(); 
        System.out.println("Internship Duration: " + internshipDuration);
    }
}

public class Project{
    public static void main(String[] args) {
        System.out.println("************Manager Information************");
        Manager m = new Manager();
        m.name = "Habib";
        m.age = 23;
        m.company = "NISUM";
        m.department = "Software Department";
        m.showManagerInfo();
        System.out.println();

        System.out.println("************Developer Information************");
        Developer d = new Developer();
        d.name = "Habooooo";
        d.age = 19;
        d.company = "NISUM";
        d.programmingLanguage = "Java";
        d.showDeveloperInfo(); 
        System.out.println();

        System.out.println("************Intern Information************");
        Intern i = new Intern();
        i.name = "Shahid";
        i.age = 22;
        i.company = "NISUM";
        i.internshipDuration = "6 months";
        i.showInternInfo(); 
        System.out.println();
    }
}
