package com.Student.Car;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", 25000));
        cars.add(new Car("Honda", 22000));
        cars.add(new Car("Toyota", 18000));
        cars.add(new Car("BMW", 45000));
        cars.add(new Car("Honda", 19000));

        System.out.println("---------------Original List---------------");
        System.out.println(cars);

        Collections.sort(cars);
        System.out.println("---------------Sorted List---------------");
        System.out.println(cars);

        Collections.reverse(cars);
        System.out.println("---------------Reversed List---------------");

        Car cheapest = Collections.min(cars);
        System.out.println("Cheapest Car: "+cheapest);

        Car mostExpensive = Collections.max(cars);
        System.out.println("Most Expensive (by compare To): "+mostExpensive);

        for (Car car : cars){
            System.out.println(car);
        }
    }
}
