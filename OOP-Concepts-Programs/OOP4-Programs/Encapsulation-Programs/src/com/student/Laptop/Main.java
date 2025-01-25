package com.student.Laptop;

public class Main {
    public static void main(String[] args) {
        System.out.println("***************Laptop's Details***************");
        System.out.println("***************HP Laptop Details***************");
        Laptop laptop = new Laptop();
        laptop.setBrand("HP");
        laptop.setModelName("E-lite Book");
        laptop.setProcessor("Intel i5");
        laptop.setPrice(45000);
        laptop.displayInfo();
        System.out.println();

        Laptop laptop1 = new Laptop();
        System.out.println("***************Acer Laptop Details***************");
        laptop1.setBrand("Acer");
        laptop1.setModelName("Aspire 7 A715");
        laptop1.setProcessor("Intel i5 11th Gen");
        laptop1.setPrice(47000);
        laptop1.displayInfo();
        System.out.println();

        Laptop laptop2 = new Laptop();
        System.out.println("***************Dell Laptop Details***************");
        laptop2.setBrand("Dell");
        laptop2.setModelName("XPS 13 9310");
        laptop2.setProcessor("Intel i7 11th Gen");
        laptop2.setPrice(95000);
        laptop2.displayInfo();
        System.out.println();

        Laptop laptop3 = new Laptop();
        System.out.println("***************Apple Laptop Details***************");
        laptop3.setBrand("Apple");
        laptop3.setModelName("MacBook Pro 13");
        laptop3.setProcessor("Apple M1 Chip");
        laptop3.setPrice(130000);
        laptop3.displayInfo();
        System.out.println();


        Laptop laptop4 = new Laptop();
        System.out.println("***************Lenovo Laptop Details***************");
        laptop4.setBrand("Lenovo");
        laptop4.setModelName("ThinkPad X1 Carbon");
        laptop4.setProcessor("Intel i7 10th Gen");
        laptop4.setPrice(90000);
        laptop4.displayInfo();
        System.out.println();

    }
}
