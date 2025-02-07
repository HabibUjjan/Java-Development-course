package com.Student.Human;

public class Elder implements Human {
    @Override
    public void speak() {
        System.out.println("Elder is speaking");
    }

    @Override
    public void eat() {
        System.out.println("Elder is Eating Food");
    }

    @Override
    public void walk() {
        System.out.println("Elder is walking slowly");
    }
}
