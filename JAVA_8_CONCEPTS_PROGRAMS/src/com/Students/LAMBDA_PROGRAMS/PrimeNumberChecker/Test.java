package com.Students.LAMBDA.PrimeNumberChecker;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int num = sc.nextInt();
        PrimeCheck check = (n) -> {
            if (n <= 1) return false;
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) return false;
            }
            return true;
        };
        System.out.println(num + " is Prime " + check.isPrime(num));
    }
}
