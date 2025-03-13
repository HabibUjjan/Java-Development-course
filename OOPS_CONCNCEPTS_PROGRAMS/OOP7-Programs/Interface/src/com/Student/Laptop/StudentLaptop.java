package com.Student.Laptop;

public class StudentLaptop implements Laptop{
    @Override
    public void turnOn() {
        System.out.println("Student Laptop is now ON Ready for studying");

    }

    @Override
    public void turnOff() {
        System.out.println("Student Laptop is now OFF");

    }

    @Override
    public void performTask() {
        System.out.println("Student Laptop is running study software, presentations, and notes");

    }
}
