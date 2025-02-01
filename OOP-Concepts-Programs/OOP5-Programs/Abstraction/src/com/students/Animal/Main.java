package com.students.Animal;

public class Main {
    public static void main(String[] args) {
        System.out.println("**********Cat Details**********");
        Animal cat = new cat();
        cat.setName("Poppy");
        cat.setAge(9);
        cat.displayInfo();
        cat.sound();
        System.out.println();

        System.out.println("**********Bird Details**********");
        Animal bird = new Bird();
        bird.setName("Berry");
        bird.setAge(7);
        bird.displayInfo();
        bird.sound();
        System.out.println();

        System.out.println("**********Dog Details**********");
        Animal dog = new Dog();
        dog.setName("Bowie");
        dog.setAge(8);
        dog.displayInfo();
        dog.sound();
        System.out.println();
    }
}
