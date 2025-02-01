package com.Student.Electronics;

public class ElectronicDevice {
    private String brand;
    private int power;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    void displayInfo() {
        System.out.println("Electronic Device: " + brand + ", Power: " + power + " watts");
    }
}