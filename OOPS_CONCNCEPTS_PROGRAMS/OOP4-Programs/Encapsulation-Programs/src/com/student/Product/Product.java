package com.student.Product;

public class Product {
    private String productName;
    private double price;
    private int quantity;
    private String storeName;

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public void displayInfo(){
        System.out.println("Product Name: " + this.getProductName());
        System.out.println("Price: " + this.getPrice());
        System.out.println("Quantity: " + this.getQuantity());
        System.out.println("Store Name: " + this.getStoreName());


    }
}
