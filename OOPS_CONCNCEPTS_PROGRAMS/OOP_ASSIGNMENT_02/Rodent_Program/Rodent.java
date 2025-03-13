public class Rodent {
    void eat() {
        System.out.println("Rodent is eating");
    }
    void sleep() {
        System.out.println("Rodent is sleeping");
    }
    void sound() {
        System.out.println("Rodent makes a sound");
    }
}

class Mouse extends Rodent {
    @Override
    void sound() {
        System.out.println("Mouse squeaks!");
    }
}

class Gerbil extends Rodent {
    @Override
    void sound() {
        System.out.println("Gerbil chirps!");
    }
}

class Hamster extends Rodent {
    @Override
    void sound() {
        System.out.println("Hamster squeals!");
    }
}
