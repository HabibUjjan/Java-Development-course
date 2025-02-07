package com.Student.Vehicle;

public class Bike implements Vehicle{
    @Override
    public void start() {
        System.out.println("Bike is Starting");
    }

    @Override
    public void stop() {
        System.out.println("Bike has stopped");
    }
}
