package com.student.Mobile;

public class Main {
    public static void main(String[] args) {
        System.out.println("********Mobile Details********");
        System.out.println("********Apple Mobile Details********");
        Mobile mobile = new Mobile();
        mobile.setBrand("Apple");
        mobile.setModel("iPhone 14");
        mobile.setBatteryCapacity(5000);
        mobile.setPrice(77999);
        mobile.displayInfo();
        System.out.println();

        System.out.println("********Samsung Mobile Details********");
        Mobile mobile1 = new Mobile();
        mobile1.setBrand("Samsung");
        mobile1.setModel("Galaxy S23");
        mobile1.setBatteryCapacity(4500);
        mobile1.setPrice(76999);
        mobile1.displayInfo();
        System.out.println();

        System.out.println("********OnePlus Mobile Details********");
        Mobile mobile2 = new Mobile();
        mobile2.setBrand("OnePlus");
        mobile2.setModel("OnePlus 11");
        mobile2.setBatteryCapacity(4700);
        mobile2.setPrice(70999);
        mobile2.displayInfo();
        System.out.println();

        System.out.println("********Xiaomi Mobile Details********");
        Mobile mobile3 = new Mobile();
        mobile3.setBrand("Xiaomi");
        mobile3.setModel("Redmi Note 12 Pro");
        mobile3.setBatteryCapacity(4700);
        mobile3.setPrice(70999);
        mobile3.displayInfo();
        System.out.println();
    }
}
