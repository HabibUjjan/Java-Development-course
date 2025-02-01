package com.students.Human;

public abstract class Human {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void job();

    public void displayInfo(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);

    }
}
