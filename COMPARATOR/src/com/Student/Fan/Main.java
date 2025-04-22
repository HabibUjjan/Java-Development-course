package com.Student.Fan;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Fan> fans = new ArrayList<>();

        fans.add(new Fan("Samsung", 1500));
        fans.add(new Fan("LG", 2000));
        fans.add(new Fan("Crompton", 1800));
        fans.add(new Fan("Bajaj", 2200));


        System.out.println("---------------Original List---------------");
        for (Fan fan : fans) {
            System.out.println(fan);
        }


        Collections.sort(fans, Fan.speedComparator);
        System.out.println("---------------Sorted List by Speed---------------");
        for (Fan fan : fans) {
            System.out.println(fan);
        }
    }
}

