package com.Student.Human;

public class Man implements Human {
    @Override
    public void speak() {
        System.out.println("Man is speaking");

    }

    @Override
    public void eat() {
        System.out.println("Man is Eating Food");
    }

    @Override
    public void walk() {
        System.out.println("Man is Walking");
    }
}
