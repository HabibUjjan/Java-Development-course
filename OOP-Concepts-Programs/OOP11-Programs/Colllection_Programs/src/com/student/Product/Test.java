package com.student.Product;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        System.out.println("***********PRODUCT DETAILS***********");
        Product product1 = new Product();
        product1.setName("Laptop");
        product1.setPrice(45000);
        product1.setQuantity(4);
        productList.add(product1);

        Product product2 = new Product();
        product2.setName("Smartphone");
        product2.setPrice(25000);
        product2.setQuantity(10);
        productList.add(product2);

        Product product3 = new Product();
        product3.setName("Smartwatch");
        product3.setPrice(5000);
        product3.setQuantity(15);
        productList.add(product3);

        Product product4 = new Product();
        product4.setName("Headphones");
        product4.setPrice(1500);
        product4.setQuantity(20);
        productList.add(product4);

        Product product5 = new Product();
        product5.setName("Television");
        product5.setPrice(30000);
        product5.setQuantity(3);
        productList.add(product5);

        Product product6 = new Product();
        product6.setName("Tablet");
        product6.setPrice(15000);
        product6.setQuantity(7);
        productList.add(product6);

        Product product7 = new Product();
        product7.setName("Camera");
        product7.setPrice(20000);
        product7.setQuantity(5);
        productList.add(product7);

        Product product8 = new Product();
        product8.setName("Washing Machine");
        product8.setPrice(18000);
        product8.setQuantity(8);
        productList.add(product8);

        Product product9 = new Product();
        product9.setName("Refrigerator");
        product9.setPrice(25000);
        product9.setQuantity(6);
        productList.add(product9);

        Product product10 = new Product();
        product10.setName("Microwave Oven");
        product10.setPrice(8000);
        product10.setQuantity(12);
        productList.add(product10);

        for (int i = 0; i<productList.size(); i++){
            Product product = productList.get(i);
            System.out.println(product);
            System.out.println();
        }
    }
}
