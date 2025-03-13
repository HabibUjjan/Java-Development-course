class Student {
    String name;
    int age;
    String id;
    String department;

    //student information
    void printStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
        System.out.println("ID  : " + id);
        System.out.println("Department : " + department);
        System.out.println();
    }

    //update student age
    void updateAge(int newAge) {
        age = newAge;
    }

    public static void main(String Args[]) {
        System.out.println("<<<<<<<<STUDENT'S INFORMATION>>>>>>>>");
        Student habibStudent = new Student();
        habibStudent.name = "Habibullah Ujjan";
        habibStudent.age = 18;
        habibStudent.id = "BSE-23F-001";
        habibStudent.department = "Software Engineering";
        habibStudent.printStudentInfo();

        // Updating age 
        habibStudent.updateAge(19);
        System.out.println("After age update:");
        habibStudent.printStudentInfo();

        Student muzafarStudent = new Student();
        muzafarStudent.name = "Muzafar Ali";
        muzafarStudent.age = 20;
        muzafarStudent.id = "BSE-23F-002";
        muzafarStudent.department = "Software Engineering";
        muzafarStudent.printStudentInfo();

        // Updating age 
        muzafarStudent.updateAge(21);
        System.out.println("After age update:");
        muzafarStudent.printStudentInfo();

        Student shahzadStudent = new Student();
        shahzadStudent.name = "Shahzad Ujjan";
        shahzadStudent.age = 21;
        shahzadStudent.id = "BSE-23F-003";
        shahzadStudent.department = "Software Engineering";
        shahzadStudent.printStudentInfo();


        Student sajidStudent = new Student();
        sajidStudent.name = "Sajid Hussain";
        sajidStudent.age = 20;
        sajidStudent.id = "DS-24F-004";
        sajidStudent.department = "Data Science Engineering";
        sajidStudent.printStudentInfo();


        Student partabStudent = new Student();
        partabStudent.name = "Partab Kumar";
        partabStudent.age = 22;
        partabStudent.id = "CS-21F-005";
        partabStudent.department = "Computer Science";
        partabStudent.printStudentInfo();

    }
}
