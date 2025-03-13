package com.Student.Human;

public class Child implements Human {
    @Override
    public void speak() {
        System.out.println("Child is speaking");
    }

    @Override
    public void eat() {
        System.out.println("Child is Eating Food");
    }

    @Override
    public void walk() {
        System.out.println("Child is walking");
    }
}
