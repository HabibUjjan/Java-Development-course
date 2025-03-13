package com.Student.Vehicle;

public class Bus implements Vehicle{
    @Override
    public void start() {
        System.out.println("Bus is starting");

    }

    @Override
    public void stop() {
        System.out.println("Bus has stopped");

    }
}
