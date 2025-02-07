class Animal {
    public void move() {
        System.out.println("The animal moves");
    }
}
class Cheetah extends Animal {
    @Override
    public void move() {
        System.out.println("The cheetah runs");
    }
}
class AnimalProgram{
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Cheetah fastCheetah = new Cheetah();
        genericAnimal.move();
        fastCheetah.move();
    }
}
