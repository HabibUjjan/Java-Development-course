package com.students.Employee;

public class Main {
    public static void main(String[] args) {
        System.out.println("**********Manager Details**********");
        Employee manager = new Manager();
        manager.setName("Habib");
        manager.setDesignation("Manager");
        manager.setSalary(250000);
        manager.displayInfo();
        manager.jobDescription();
        System.out.println();


        System.out.println("**********Developer Details**********");
        Employee developer = new Developer();
        developer.setName("Sajid");
        developer.setDesignation("Developer");
        developer.setSalary(200000);
        developer.displayInfo();
        developer.jobDescription();
        System.out.println();


        System.out.println("**********Tester Details**********");
        Employee tester = new Tester();
        tester.setName("Ali");
        tester.setDesignation("Developer");
        tester.setSalary(150000);
        tester.displayInfo();
        tester.jobDescription();
        System.out.println();

    }
}
