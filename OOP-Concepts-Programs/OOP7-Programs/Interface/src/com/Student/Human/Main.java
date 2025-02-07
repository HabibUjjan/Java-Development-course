package com.Student.Human;

public class Main {
    public static void main(String[] args) {
        Human man = new Man();
        Human woman = new Woman();
        Human child = new Child();
        Human elder = new Elder();


        System.out.println("***********Information Of Man***********");
        man.eat();
        man.eat();
        man.walk();
        System.out.println();


        System.out.println("***********Information Of Woman***********");
        woman.eat();
        woman.speak();
        woman.walk();
        System.out.println();


        System.out.println("***********Information Of Child***********");
        child.eat();
        child.speak();
        child.walk();
        System.out.println();


        System.out.println("***********Information Of Elder***********");
        elder.eat();
        elder.speak();
        elder.walk();
    }
}
