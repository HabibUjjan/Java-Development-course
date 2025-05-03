package com.Students.LAMBDA.MultiplicationTable;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number for Table: ");
        int num = sc.nextInt();

        TablePrinter table = (number) -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " x " + number + " = " + (number * i));
            }
        };
        table.print(num);
    }
}
