package com.Student.Animal;

public class Elephant implements Animal{
    @Override
    public void sound() {
        System.out.println("Elephant says: Trumpet!");

    }

    @Override
    public void move() {
        System.out.println("Elephant is walking slowly");

    }
}
