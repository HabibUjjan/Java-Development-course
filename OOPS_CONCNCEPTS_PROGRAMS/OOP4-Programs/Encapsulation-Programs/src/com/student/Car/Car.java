package com.student.Car;

public class Car {
    private String make;
    private String modelName;
    private double price;
    private String color;


    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return this.make;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return this.modelName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void displayInfo(){
        System.out.println("Make: " + this.getMake());
        System.out.println("Model Name: " + this.getModelName());
        System.out.println("Price: " + this.getPrice());
        System.out.println("Color: " + this.getColor());

    }
}
