package com.Student.Electronics;

public class Laptop extends ElectronicDevice {
    @Override
    void displayInfo() {
        System.out.println("Laptop: " + getBrand() + ", Power: " + getPower() + " watts");
    }
}
