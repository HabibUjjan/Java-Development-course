package com.students.Animal;

public abstract class Animal {
    private String name;
    private int age;


    public abstract void sound();

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayInfo(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
    }
}
