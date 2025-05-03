package com.Students.LAMBDA.GradeCalculator;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();
        Grade grade = (m) -> {
            if (m >= 90) {
                return "A+";
            } else if (m >= 80) {
                return "A";
            }
            else if (m >= 70){
                return "B";
            } else {
                return "C";
            }
        };
        System.out.println("Your Grade is: " + grade.getGrade(marks));
    }
}
