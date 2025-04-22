package com.Student.Laptop;

import java.util.*;

public class Laptop {
    String brand;
    int price;

    public Laptop(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return " Laptop Brand: " + brand + " , " + "Price:"+ price;
    }


    public static Comparator<Laptop> priceComparator = new Comparator<Laptop>() {
        @Override
        public int compare(Laptop laptop1, Laptop laptop2) {
            return laptop1.price - laptop2.price;
        }
    };
}


