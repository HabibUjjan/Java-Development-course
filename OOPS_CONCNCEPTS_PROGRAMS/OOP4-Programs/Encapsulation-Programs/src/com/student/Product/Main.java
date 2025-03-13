package com.student.Product;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        System.out.println("Product Information:");
        product.setProductName("Laptop");
        product.setPrice(34000);
        product.setQuantity(250);
        product.setStoreName("HabibStore");
        product.displayInfo();
        System.out.println();

        product.setProductName("Smartphone");
        product.setPrice(50000);
        product.setQuantity(150);
        product.setStoreName("HabibStore");
        product.displayInfo();
        System.out.println();

        product.setProductName("Headphones");
        product.setPrice(400);
        product.setQuantity(90);
        product.setStoreName("HabibStore");
        product.displayInfo();
        System.out.println();
    }
}
