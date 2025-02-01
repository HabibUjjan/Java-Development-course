package com.students.ElectronicDevices;

public abstract class ElectronicDevice {
    private String brand;
    private int price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract void usage();

    public void displayInfo(){
        System.out.println("Brand: "+this.brand);
        System.out.println("Price: "+this.price);
    }
}
