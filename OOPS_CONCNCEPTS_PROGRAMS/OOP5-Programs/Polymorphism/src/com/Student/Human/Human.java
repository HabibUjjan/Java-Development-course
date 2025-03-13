package com.Student.Human;

public class Human {
    private String name;
    private int age;
    void speak() {
        System.out.println("Humans speak in different languages.");
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
}
