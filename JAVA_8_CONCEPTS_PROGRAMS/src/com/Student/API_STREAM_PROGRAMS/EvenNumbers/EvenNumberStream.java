package com.Student.API_STREAM.EvenNumbers;

import java.util.Arrays;
import java.util.List;

public class EvenNumberStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);
        System.out.println("Even Numbers:");
        numbers.stream().filter(n -> n % 2 == 0)
                .forEach(n-> System.out.println(n));
    }
}

