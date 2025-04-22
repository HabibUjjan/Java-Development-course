package com.Student.Mobile;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mobile> mobiles = new ArrayList<>();
        mobiles.add(new Mobile("Vivo",70000));
        mobiles.add(new Mobile("Samsung",56000));
        mobiles.add(new Mobile("Nokia",23000));
        mobiles.add(new Mobile("Oppo",30000));
        mobiles.add(new Mobile("iPhone",15000));


        System.out.println("--------------Before Sorting--------------");
        for (Mobile mobile : mobiles){
            System.out.println(mobile);

        }

        System.out.println();
        Collections.sort(mobiles);
        System.out.println("--------------After Sorting--------------");
        for(Mobile mobile : mobiles){
            System.out.println(mobile);
        }
    }
}
