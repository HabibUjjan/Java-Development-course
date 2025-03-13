package com.Student.Animal;

public class Cat implements Animal{

    @Override
    public void sound() {
        System.out.println("Cat says: Meow Meow!");

    }

    @Override
    public void move() {
        System.out.println("Cat is walking gracefully");

    }
}
