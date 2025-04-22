package com.Student.Laptop;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("Dell", 50000));
        laptops.add(new Laptop("HP", 410000));
        laptops.add(new Laptop("Apple", 30200));
        laptops.add(new Laptop("Lenovo", 26600));


        System.out.println("---------------Original List---------------");
        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }

        Collections.sort(laptops, Laptop.priceComparator);
        System.out.println("---------------Sorted List by Price---------------");
        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }
    }
}

