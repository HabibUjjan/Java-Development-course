package com.Student.Mobile;


import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mobile> mobiles = new ArrayList<>();
        mobiles.add(new Mobile("Samsung", 700));
        mobiles.add(new Mobile("Apple", 1200));
        mobiles.add(new Mobile("OnePlus", 600));
        mobiles.add(new Mobile("Xiaomi", 300));

        System.out.println("---------------Original List---------------");
        for (Mobile mobile : mobiles) {
            System.out.println(mobile);
        }

        Collections.sort(mobiles, Mobile.priceComparator);
        System.out.println();
        System.out.println("---------------Sorted List by Price---------------");
        for (Mobile mobile : mobiles) {
            System.out.println(mobile);
        }


        Collections.reverse(mobiles);
        System.out.println();
        System.out.println("---------------Reversed List (Highest Price First)---------------");
        for (Mobile mobile : mobiles) {
            System.out.println(mobile);
        }
    }
}

