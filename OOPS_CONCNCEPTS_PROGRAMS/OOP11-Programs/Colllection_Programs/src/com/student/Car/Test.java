package com.student.Car;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        System.out.println("**************CAR DATA INFORMATION**************");
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Toyota", "GLI", 2019, 34980000));
        carList.add(new Car("Ford", "Mustang", 2021, 35000));
        carList.add(new Car("Honda", "Civic", 2020, 25000));
        carList.add(new Car("BMW", "X5", 2023, 60000));
        carList.add(new Car("Tesla", "Model 3", 2022, 45000));
        carList.add(new Car("Chevrolet", "Malibu", 2021, 24000));
        carList.add(new Car("Nissan", "Altima", 2020, 21000));
        carList.add(new Car("Audi", "A4", 2022, 38000));
        carList.add(new Car("Mercedes", "C-Class", 2021, 42000));
        carList.add(new Car("Kia", "Optima", 2020, 22000));

        for (int i = 0; i< carList.size(); i++){
            Car car = carList.get(i);;
            car.displayInfo();
            System.out.println();
        }
    }
}
