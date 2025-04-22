package com.Student.Mobile;


import java.util.Comparator;

public class Mobile {
    String brand;
    int price;

    public Mobile(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mobile Brand: " + brand + ", Price: $" + price;
    }

    public static Comparator<Mobile> priceComparator = new Comparator<Mobile>() {
        @Override
        public int compare(Mobile mobile1, Mobile mobile2) {
            return mobile1.price - mobile2.price;
        }
    };
}

