package com.Student.Electronics;

public class Smartphone extends ElectronicDevice {
    @Override
    void displayInfo() {
        System.out.println("Smartphone: " + getBrand() + ", Power: " + getPower() + " watts");
    }
}
