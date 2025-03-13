package com.students.ElectronicDevices;

public class Main {
    public static void main(String[] args) {
        ElectronicDevice laptop = new Laptop();
        System.out.println("*********Laptop Details**********");
        laptop.setBrand("HP");
        laptop.setPrice(32000);
        laptop.displayInfo();
        laptop.usage();
        System.out.println();


        ElectronicDevice mobile = new Mobile();
        System.out.println("*********Mobile Details**********");
        mobile.setBrand("HP");
        mobile.setPrice(32000);
        mobile.displayInfo();
        mobile.usage();
        System.out.println();


        ElectronicDevice computer = new Computer();
        System.out.println("*********Computer Details**********");
        computer.setBrand("Compaq");
        computer.setPrice(22000);
        computer.displayInfo();
        computer.usage();
        System.out.println();
    }
}
