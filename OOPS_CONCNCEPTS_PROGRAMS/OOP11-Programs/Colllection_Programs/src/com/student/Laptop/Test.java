package com.student.Laptop;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        System.out.println("**********LAPTOP'S DETAILS**********");
        List<Laptop> laptopList = new ArrayList<>();
        Laptop laptop1 = new Laptop();
        laptop1.setModelName("HP");
        laptop1.setPrice(46000);
        laptop1.setColor("Silver");
        laptop1.setBatteryLife("12 hours");
        laptopList.add(laptop1);

        Laptop laptop2 = new Laptop();
        laptop2.setModelName("Dell");
        laptop2.setPrice(55000);
        laptop2.setColor("Black");
        laptop2.setBatteryLife("10 hours");
        laptopList.add(laptop2);

        Laptop laptop3 = new Laptop();
        laptop3.setModelName("Apple MacBook Pro");
        laptop3.setPrice(120000);
        laptop3.setColor("Space Gray");
        laptop3.setBatteryLife("15 hours");
        laptopList.add(laptop3);

        Laptop laptop4 = new Laptop();
        laptop4.setModelName("Lenovo ThinkPad");
        laptop4.setPrice(62000);
        laptop4.setColor("Carbon Black");
        laptop4.setBatteryLife("13 hours");
        laptopList.add(laptop4);

        Laptop laptop5 = new Laptop();
        laptop5.setModelName("Acer Aspire");
        laptop5.setPrice(45000);
        laptop5.setColor("Blue");
        laptop5.setBatteryLife("9 hours");
        laptopList.add(laptop5);

        Laptop laptop6 = new Laptop();
        laptop6.setModelName("Asus ROG");
        laptop6.setPrice(85000);
        laptop6.setColor("Red");
        laptop6.setBatteryLife("10 hours");
        laptopList.add(laptop6);

        Laptop laptop7 = new Laptop();
        laptop7.setModelName("Microsoft Surface");
        laptop7.setPrice(95000);
        laptop7.setColor("Platinum");
        laptop7.setBatteryLife("11 hours");
        laptopList.add(laptop7);

        Laptop laptop8 = new Laptop();
        laptop8.setModelName("Razer Blade");
        laptop8.setPrice(105000);
        laptop8.setColor("Black");
        laptop8.setBatteryLife("8 hours");
        laptopList.add(laptop8);

        Laptop laptop9 = new Laptop();
        laptop9.setModelName("Samsung Galaxy Book");
        laptop9.setPrice(70000);
        laptop9.setColor("Mystic Silver");
        laptop9.setBatteryLife("12 hours");
        laptopList.add(laptop9);

        Laptop laptop10 = new Laptop();
        laptop10.setModelName("MSI GE Raider");
        laptop10.setPrice(90000);
        laptop10.setColor("Titanium Gray");
        laptop10.setBatteryLife("9 hours");
        laptopList.add(laptop10);


        for (int i = 0; i<laptopList.size(); i++){
            Laptop laptops = laptopList.get(i);
            System.out.println(laptops);
            System.out.println();
        }
    }
}
