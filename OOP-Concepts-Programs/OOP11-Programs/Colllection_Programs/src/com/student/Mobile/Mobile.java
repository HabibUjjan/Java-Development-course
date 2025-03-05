package com.student.Mobile;

public class Mobile {
    private String brand;
    private String modelName;
    private double price;
    private int year;
    private String color;
    private int ram;
    private int storage;

    Mobile(String brand, String modelName, double price, int year, String color, int ram, int storage) {
        this.brand = brand;
        this.modelName = modelName;
        this.price = price;
        this.year = year;
        this.color = color;
        this.ram = ram;
        this.storage = storage;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model Name: " + modelName);
        System.out.println("Price: " + price);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Ram: " + ram + "GB");
        System.out.println("Storage: " + storage + "GB");
    }
}
