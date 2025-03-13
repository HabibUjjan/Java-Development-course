package com.Student.Animal;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal elephant = new Elephant();
        Animal bird = new Bird();


        System.out.println("*********Dog Details*********");
        dog.sound();
        dog.move();
        System.out.println();


        System.out.println("*********Cat Details*********");
        cat.sound();
        cat.move();
        System.out.println();


        System.out.println("*********Elephant Details*********");
        elephant.sound();
        elephant.move();
        System.out.println();


        System.out.println("*********Bird Details*********");
        bird.sound();
        bird.move();
        System.out.println();
    }
}
