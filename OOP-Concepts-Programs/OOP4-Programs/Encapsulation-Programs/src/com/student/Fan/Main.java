package com.student.Fan;

public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan();
        System.out.println("***********Fan's Information***********");
        System.out.println("*********Panasonic Fan Details*********");
        fan.setBrand("Panasonic");
        fan.setPrice(5000);
        fan.setSpeed(2);
        fan.setColor("white");
        fan.displayInfo();
        System.out.println();

        System.out.println("*********Orient Fan Details*********");
        Fan fan1 = new Fan();
        fan1.setBrand("Orient");
        fan1.setPrice(7000);
        fan1.setSpeed(4);
        fan1.setColor("Blue");
        fan1.displayInfo();
        System.out.println();

        System.out.println("*********Havells Fan Details*********");
        Fan fan2 = new Fan();
        fan2.setBrand("Havells");
        fan2.setPrice(8000);
        fan2.setSpeed(6);
        fan2.setColor("Gery");
        fan2.displayInfo();
        System.out.println();

        System.out.println("*********Bajaj Fan Details Usha*********");
        Fan fan3 = new Fan();
        fan3.setBrand("Bajaj");
        fan3.setPrice(9000);
        fan3.setSpeed(3);
        fan3.setColor("Red");
        fan3.displayInfo();
        System.out.println();

        System.out.println("*********Usha Fan Details*********");
        Fan fan4 = new Fan();
        fan4.setBrand("Usha");
        fan4.setPrice(10000);
        fan4.setSpeed(6);
        fan4.setColor("Black");
        fan4.displayInfo();
        System.out.println();


    }
}
