package com.student.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("**************Car's Details**************");
        System.out.println("******Mustang Car******");
        car.setMake("Toyota");
        car.setModelName("Mustang");
        car.setPrice(4500000);
        car.setColor("Blue");
        car.displayInfo();
        System.out.println();


        Car car1 = new Car();
        System.out.println("******Accord Car******");
        car1.setMake("Honda");
        car1.setModelName("Accord");
        car1.setPrice(2800000);
        car1.setColor("Green");
        car1.displayInfo();
        System.out.println();


        Car car2 = new Car();
        System.out.println("******Corolla Car******");
        car2.setMake("Toyota");
        car2.setModelName("Corolla");
        car2.setPrice(3200000);
        car2.setColor("Yellow");
        car2.displayInfo();
        System.out.println();

        Car car3 = new Car();
        System.out.println("******Mustang Car******");
        car3.setMake("Ford");
        car3.setModelName("Mustang");
        car3.setPrice(4500000);
        car3.setColor("Blue");
        car3.displayInfo();
        System.out.println();


        Car car4 = new Car();
        System.out.println("******BMW Car******");
        car4.setMake("BMW");
        car4.setModelName("M4");
        car4.setPrice(7500000);
        car4.setColor("Red");
        car4.displayInfo();
        System.out.println();


        Car car5 = new Car();
        System.out.println("******Audi Car******");
        car5.setMake("Audi");
        car5.setModelName("A4");
        car5.setPrice(3800000);
        car5.setColor("Black");
        car5.displayInfo();
        System.out.println();
    }
}
