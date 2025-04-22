package com.Student.Engineer;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Engineer> engineers = new  ArrayList<>();
        engineers.add(new Engineer("Habib  ",70000));
        engineers.add(new Engineer("Sajid  ",30000));
        engineers.add(new Engineer("Alisha ",20000));
        engineers.add(new Engineer("Bilal  ",15000));



        System.out.println("--------------Before Sorting--------------");
        for (Engineer engineer : engineers){
            System.out.println(engineer);
        }

        System.out.println();
        Collections.sort(engineers);
        System.out.println("--------------After Sorting--------------");
        for (Engineer engineer : engineers){
            System.out.println(engineer);
        }

    }

}
