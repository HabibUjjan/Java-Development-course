package com.Student.Laptop;

public class BusinessLaptop implements Laptop{
    @Override
    public void turnOn() {
        System.out.println("Business Laptop is now ON Ready for work");

    }

    @Override
    public void turnOff() {
        System.out.println("Business Laptop is now OFF");

    }

    @Override
    public void performTask() {
        System.out.println("Business Laptop is running productivity software (Word, Excel,)");

    }
}
