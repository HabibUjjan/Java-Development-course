package com.Student.association;

public class Main {
    public static void main(String[] args) {
        Battery battery = new Battery();
        battery.setType("Lithium");
        Mobile mobile = new Mobile();
        mobile.setBrand("Samsung");
        mobile.setBattery(battery);
        System.out.println("*********Mobile Details*********");
        System.out.println("Mobile Brand: " + mobile.getBrand());
        System.out.println("Battery Type: " + mobile.getBattery().getType());
        System.out.println();


        Heart heart = new Heart();
        heart.setType("Cardiac");
        Human human = new Human();
        human.setName("John");
        human.setHeart(heart);
        System.out.println("*********Human Details*********");
        System.out.println("Human Name: " + human.getName());
        System.out.println("Heart Type: " + human.getHeart().getType());
        System.out.println();


        Tail tail = new Tail();
        tail.setType("Long");
        Animal animal = new Animal();
        animal.setSpecies("Dog");
        animal.setTail(tail);
        System.out.println("*********Animal Details*********");
        System.out.println("Animal Species: " + animal.getSpecies());
        System.out.println("Tail Type: " + animal.getTail().getType());
        System.out.println();


        Engine engine = new Engine();
        engine.setEngineType("V6");
        Car car = new Car();
        car.setModel("Toyota");
        car.setEngine(engine);
        System.out.println("*********Car Details*********");
        System.out.println("Car Model: " + car.getModel());
        System.out.println("Engine Type: " + car.getEngine().getEngineType());
        System.out.println();


        Book book = new Book();
        book.setTitle("Java Programming");
        Library library = new Library();
        library.setName("City Library");
        library.setBook(book);
        System.out.println("*********Library Details*********");
        System.out.println("Library Name: " + library.getName());
        System.out.println("Book Title: " + library.getBook().getTitle());
    }
}

