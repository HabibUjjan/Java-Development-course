package com.student.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("********Student's Information********");
        Student student = new Student();
        student.setName("Habib");
        student.setAge(19);
        student.setId("BSE-001");
        student.setDepartment("Software Engineering");
        student.displayInfo();
        System.out.println();

        Student student1 = new Student();
        student1.setName("Sajid");
        student1.setAge(21);
        student1.setId("BSE-002");
        student1.setDepartment("Data Engineering");
        student1.displayInfo();
        System.out.println();

        Student student2 = new Student();
        student2.setName("Shahzad");
        student2.setAge(22);
        student2.setId("BSE-003");
        student2.setDepartment("Networking Engineering");
        student2.displayInfo();
        System.out.println();

        Student student3 = new Student();
        student3.setName("Muzafar Ali");
        student3.setAge(23);
        student3.setId("BSE-004");
        student3.setDepartment("Devops Engineering");
        student3.displayInfo();
        System.out.println();

        Student student4 = new Student();
        student4.setName("Abu Bakar");
        student4.setAge(20);
        student4.setId("BSE-005");
        student4.setDepartment("Testing Engineering");
        student4.displayInfo();
        System.out.println();
    }
}
