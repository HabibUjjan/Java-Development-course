package com.Students.LAMBDA.FibonacciSeriesGenerator;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many terms: ");
        int count = sc.nextInt();
        Fibonacci fib = (n) -> {
            int a = 0, b = 1;
            for (int i = 1; i <= n; i++) {
                System.out.print(a + " ");
                int temp = a + b;
                a = b;
                b = temp;
            }
        };
        fib.generate(count);
    }
}
