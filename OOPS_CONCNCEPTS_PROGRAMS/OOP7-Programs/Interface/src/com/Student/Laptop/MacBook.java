package com.Student.Laptop;

public class MacBook implements Laptop{
    @Override
    public void turnOn() {
        System.out.println("MacBook is now ON Welcome to macOS");

    }

    @Override
    public void turnOff() {
        System.out.println("MacBook is now OFF");

    }

    @Override
    public void performTask() {
        System.out.println("MacBook is running macOS applications like Safari, Pages");

    }
}
