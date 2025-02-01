package com.Student.Human;

public class Elderly extends Human {
    @Override
    public void speak() {
        System.out.println(super.getName() + " Ali "+ "Elderly speaks: Back in my day...");
    }
}
