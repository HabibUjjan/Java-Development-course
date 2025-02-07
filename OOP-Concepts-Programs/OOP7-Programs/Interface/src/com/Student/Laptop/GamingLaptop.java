package com.Student.Laptop;

public class GamingLaptop implements Laptop{
    @Override
    public void turnOn() {
        System.out.println("Gaming Laptop is now ON Ready to play games");

    }

    @Override
    public void turnOff() {
        System.out.println("Gaming Laptop is now OFF");

    }

    @Override
    public void performTask() {
        System.out.println("Gaming Laptop is running high-end games");

    }
}
