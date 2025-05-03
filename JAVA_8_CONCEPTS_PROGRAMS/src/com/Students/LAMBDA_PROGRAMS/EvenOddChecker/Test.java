package com.Students.LAMBDA.EvenOddChecker;

import java.util.*;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        EvenOdd evenOdd = (n) -> {
            if (n % 2 == 0){
                System.out.println("Even Number");
            } else {
                System.out.println("Odd Number");
            }
            return "";
        };

        evenOdd.check(num);
    }
}
