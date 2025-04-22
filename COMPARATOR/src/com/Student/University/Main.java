package com.Student.University;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<University> universities = new ArrayList<>();

        universities.add(new University("SMIU", 8000));
        universities.add(new University("Sindh University", 18000));
        universities.add(new University("MUET", 13000));
        universities.add(new University("DUET", 11000));

        System.out.println("---------------Original List---------------");
        for (University university : universities) {
            System.out.println(university);
        }


        Collections.sort(universities, University.studentsCountComparator);
        System.out.println();
        System.out.println("---------------Sorted List by Students Count---------------");
        for (University university : universities) {
            System.out.println(university);
        }


        Collections.reverse(universities);
        System.out.println();
        System.out.println("---------------Reversed List (Highest Students Count First)---------------");
        for (University university : universities) {
            System.out.println(university);
        }
    }
}

