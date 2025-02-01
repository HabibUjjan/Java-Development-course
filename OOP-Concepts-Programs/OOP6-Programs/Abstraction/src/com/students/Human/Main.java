package com.students.Human;

public class Main {
    public static void main(String[] args) {
        Human teacher = new Teacher();
        System.out.println("********Teacher Information********");
        teacher.setName("Habib");
        teacher.setAge(19);
        teacher.displayInfo();
        teacher.job();
        System.out.println();

        Human student = new Student();
        System.out.println("********Student Information********");
        student.setName("Sakina");
        student.setAge(17);
        student.displayInfo();
        student.job();
        System.out.println();

        Human doctor = new Doctor();
        System.out.println("********Doctor Information********");
        doctor.setName("Fatima");
        doctor.setAge(21);
        doctor.displayInfo();
        doctor.job();
        System.out.println();

        Human engineer = new Engineer();
        System.out.println("********Engineer Information********");
        engineer.setName("Fatima");
        engineer.setAge(21);
        engineer.displayInfo();
        engineer.job();
    }
}
