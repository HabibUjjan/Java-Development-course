package com.student.Laptop;

public class Laptop {
    private String modelName;
    private double price;
    private String color;
    private String batteryLife;


    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(String batteryLife) {
        this.batteryLife = batteryLife;
    }

    @Override
    public String toString() {
        return
                "Model Name: " + modelName + '\'' +
                "Price: " + price +
                "Color: " + color + '\'' +
                "Battery Life: " + batteryLife + '\'' +
                "";
    }

//    public void displayInfo(){
//        System.out.println(this);
////        System.out.println("Model Name: "+modelName);
////        System.out.println("Price: "+price);
////        System.out.println("Color: "+color);
////        System.out.println("BatteryLife" + "Years");
//    }
}
