package com.Student.Tablet;


import java.util.Comparator;

public class Tablet {
    String brand;
    int price;

    public Tablet(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Tablet Brand: " + brand + ", Price: " + price;
    }

    // Comparator to sort tablets by price
    public static Comparator<Tablet> priceComparator = new Comparator<Tablet>() {
        @Override
        public int compare(Tablet tablet1, Tablet tablet2) {
            return tablet1.price - tablet2.price;
        }
    };
}

