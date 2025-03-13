package com.Student.Animal;

public class Dog implements Animal{
    @Override
    public void sound() {
        System.out.println("Dog says: Woof Woof!");

    }

    @Override
    public void move() {
        System.out.println("Dog is running");

    }
}
