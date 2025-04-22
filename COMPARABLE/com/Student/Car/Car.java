package com.Student.Car;

public class Car implements Comparable<Car>{
    String model;
    int price;

    Car(String model, int price){
        this.model = model;
        this.price = price;


    }

    @Override
    public int compareTo(Car car) {
        int modelCompare = this.model.compareTo(car.model);
        if (modelCompare !=0) {
            return modelCompare;
        }else {
            return this.price - car.price;
        }
    }

    @Override
    public String toString() {
        return "Car: Model = " + model + "," + "Price"+ price;
    }
}
