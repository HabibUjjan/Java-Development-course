package com.student.Parent;

public class Undergraduate extends Student {
    public String major;
    public int year;
    public String name = "Ahmed";

    @Override
    public void show() {
        System.out.println("I am an Undergraduate Student");
        System.out.println("My name is: " + super.name);
        System.out.println("My name is: " + name); // this.name
    }

    public void display() {
        System.out.println("Display method is called");
        super.show();
    }

    public static void main(String[] args) {
        Undergraduate u = new Undergraduate();
        u.display();
    }
}
