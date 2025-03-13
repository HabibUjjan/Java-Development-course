class Vehicle{
    public void drive() {
        System.out.println("Driving a vehicle");
    }
}
class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Repairing a car");
    }
}

class ProgramTwo{
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}
