package com.student.Laptop;

public class Laptop {
    private String Brand;
    private String modelName;
    private String processor;
    private double price;


    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getBrand() {
        return this.Brand;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return this.modelName;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getProcessor() {
        return this.processor;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void displayInfo(){
        System.out.println("Brand: " + this.getBrand());
        System.out.println("Model Name: " + this.getModelName());
        System.out.println("Processor: " + this.getProcessor());
        System.out.println("Price: " + this.getPrice());


    }
}
