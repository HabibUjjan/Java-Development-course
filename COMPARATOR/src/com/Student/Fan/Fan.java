package com.Student.Fan;
import java.util.Comparator;

public class Fan {
    String brand;
    int speed;


    public Fan(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Fan Brand: " + brand + ", Speed: " + speed + " RPM";
    }

    public static Comparator<Fan> speedComparator = new Comparator<Fan>() {
        @Override
        public int compare(Fan fan1, Fan fan2) {
            return fan1.speed - fan2.speed;
        }
    };
}

