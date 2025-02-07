package com.Student.Human;

public class Woman implements Human {
    @Override
    public void speak() {
        System.out.println("Woman is speaking.");
    }

    @Override
    public void eat() {
        System.out.println("Woman is Eating Food");
    }

    @Override
    public void walk() {
        System.out.println("Woman is Walking");
    }
}
