class Vehicle {
    String make;
    String model;
    int year;
    String fuelType;
    public void calculateFuelEfficiency() {
        System.out.println("Fuel efficiency is not defined for generic vehicle.");
    }
    public void calculateDistanceTraveled() {
        System.out.println("Distance traveled is not defined for generic vehicle.");
    }
    public void calculateMaxSpeed() {
        System.out.println("Maximum speed is not defined for generic vehicle.");
    }
}

class Truck extends Vehicle {
    @Override
    public void calculateFuelEfficiency() {
        System.out.println("Truck fuel efficiency calculated");
    }

    @Override
    public void calculateDistanceTraveled() {
        System.out.println("Truck distance traveled calculated");
    }

    @Override
    public void calculateMaxSpeed() {
        System.out.println("Truck maximum speed calculated");
    }
}

class Car extends Vehicle {
    @Override
    public void calculateFuelEfficiency() {
        System.out.println("Car fuel efficiency calculated");
    }

    @Override
    public void calculateDistanceTraveled() {
        System.out.println("Car distance traveled calculated.");
    }

    @Override
    public void calculateMaxSpeed() {
        System.out.println("Car maximum speed calculated");
    }
}
class Motorcycle extends Vehicle {
    @Override
    public void calculateFuelEfficiency() {
        System.out.println("Motorcycle fuel efficiency calculated");
    }

    @Override
    public void calculateDistanceTraveled() {
        System.out.println("Motorcycle distance traveled calculated");
    }

    @Override
    public void calculateMaxSpeed() {
        System.out.println("Motorcycle maximum speed calculated");
    }
}
class ProgramFive{
    public static void main(String[] args) {
        Truck myTruck = new Truck();
        Car myCar = new Car();
        Motorcycle myMotorcycle = new Motorcycle();

        myTruck.make = "Ford";
        myTruck.model = "F-150";
        myTruck.year = 2022;
        myTruck.fuelType = "Diesel";

        myCar.make = "Toyota";
        myCar.model = "Corolla";
        myCar.year = 2021;
        myCar.fuelType = "Petrol";

        myMotorcycle.make = "Harley-Davidson";
        myMotorcycle.model = "Street 750";
        myMotorcycle.year = 2020;
        myMotorcycle.fuelType = "Petrol";

        myTruck.calculateFuelEfficiency();
        myTruck.calculateDistanceTraveled();
        myTruck.calculateMaxSpeed();

        myCar.calculateFuelEfficiency();
        myCar.calculateDistanceTraveled();
        myCar.calculateMaxSpeed();

        myMotorcycle.calculateFuelEfficiency();
        myMotorcycle.calculateDistanceTraveled();
        myMotorcycle.calculateMaxSpeed();
    }
}
