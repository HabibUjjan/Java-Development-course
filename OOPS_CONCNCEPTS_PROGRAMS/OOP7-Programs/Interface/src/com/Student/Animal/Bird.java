package com.Student.Animal;

public class Bird implements Animal{
    @Override
    public void sound() {
        System.out.println("Bird says: Chirp Chirp!");

    }

    @Override
    public void move() {
        System.out.println("Bird is flying");

    }
}
