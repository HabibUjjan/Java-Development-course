package com.student.Car;

public class Car {
    String brand;
    String modelName;
    int year;
    double price;
        Car(String brand, String modelName, int year, double price){
            this.brand = brand;
            this.modelName = modelName;
            this.year = year;
            this.price = price;

        }

        public void displayInfo(){
            System.out.println("Brand Name: "+brand);
            System.out.println("Model Name: "+modelName);
            System.out.println("Year: "+year);
            System.out.println("Price: "+price);
        }


}
