package com.student.Fan;

public class Fan {
    private String brand;
    private double price;
    private int speed;
    private String color;


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void displayInfo(){
        System.out.println("Brand: " + this.getBrand());
        System.out.println("Price: " + this.getPrice());
        System.out.println("Speed: " + this.getSpeed() + "h");
        System.out.println("Color: " + this.getColor());

    }
}
