package com.Student.Animal;

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        Animal myCow = new Cow();
        Animal myLion = new Lion();
        Animal myElephant = new Elephant();

        myDog.sound();
        myCat.sound();
        myCow.sound();
        myLion.sound();
        myElephant.sound();
    }
}
