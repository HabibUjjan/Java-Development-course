package com.student.Mobile;

public class Mobile {
    private String brand;
    private String model;
    private int batteryCapacity;
    private double price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void displayInfo(){
        System.out.println("Brand: " + this.getBrand());
        System.out.println("Model: " + this.getModel());
        System.out.println("Battery Capacity: " + this.getBatteryCapacity() + " mAh");
        System.out.println("Price: " + this.getPrice());

    }
}
