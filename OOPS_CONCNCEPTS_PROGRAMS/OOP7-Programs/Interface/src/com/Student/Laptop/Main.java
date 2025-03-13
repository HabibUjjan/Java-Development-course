package com.Student.Laptop;

public class Main {
    public static void main(String[] args) {
        Laptop gamingLaptop = new GamingLaptop();
        Laptop businessLaptop = new BusinessLaptop();
        Laptop studentLaptop = new StudentLaptop();
        Laptop macBook = new MacBook();


        System.out.println("*********Testing Gaming Laptop*********");
        gamingLaptop.turnOn();
        gamingLaptop.performTask();
        gamingLaptop.turnOff();
        System.out.println();


        System.out.println("*********Testing Business Laptop*********");
        businessLaptop.turnOn();
        businessLaptop.performTask();
        businessLaptop.turnOff();
        System.out.println();


        System.out.println("*********Testing Student Laptop*********");
        studentLaptop.turnOn();
        studentLaptop.performTask();
        studentLaptop.turnOff();
        System.out.println();


        System.out.println("*********Testing MacBook Laptop*********");
        macBook.turnOn();
        macBook.performTask();
        macBook.turnOff();

    }
}
