package com.Student.Human;
public class Main {
    public static void main(String[] args) {
        Human anAdult = new Adult();
        Human aChild = new Child();
        Human aTeenager = new Teenager();
        Human anElderly = new Elderly();
        Human aBaby = new Baby();

        anAdult.speak();
        aChild.speak();
        aTeenager.speak();
        anElderly.speak();
        aBaby.speak();
    }
}
