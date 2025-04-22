package com.Student.Tablet;


import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Tablet> tablets = new ArrayList<>();
        tablets.add(new Tablet("Samsung", 350));
        tablets.add(new Tablet("Apple", 600));
        tablets.add(new Tablet("Lenovo", 250));
        tablets.add(new Tablet("Amazon", 150));


        System.out.println("---------------Original List---------------");
        for (Tablet tablet : tablets) {
            System.out.println(tablet);
        }


        Collections.sort(tablets, Tablet.priceComparator);
        System.out.println();
        System.out.println("---------------Sorted List by Price---------------");
        for (Tablet tablet : tablets) {
            System.out.println(tablet);
        }


        Collections.reverse(tablets);
        System.out.println();
        System.out.println("---------------Reversed List (Highest Price First)---------------");
        for (Tablet tablet : tablets) {
            System.out.println(tablet);
        }
    }
}
