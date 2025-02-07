package com.Student.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle truck = new Truck();
        Vehicle bike = new Bike();
        Vehicle bus = new Bus();


        System.out.println("*********Testing Car*********");
        car.start();
        car.stop();
        System.out.println();



        System.out.println("*********Testing Truck*********");
        truck.start();
        truck.stop();
        System.out.println();



        System.out.println("*********Testing Bike*********");
        bike.start();
        bike.stop();
        System.out.println();



        System.out.println("*********Testing Bus*********");
        bus.start();
        bus.stop();
        System.out.println();

    }
}
