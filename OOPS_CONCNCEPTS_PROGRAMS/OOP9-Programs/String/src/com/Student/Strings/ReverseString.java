package com.Student.Strings;

import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String originalString = scanner.nextLine();

        char[] chars = originalString.toCharArray();
        String reversedString = "";

        for (int i = chars.length - 1; i >= 0; i--) {
            reversedString += chars[i];
        }

        System.out.println("The reversed string is: " + reversedString);
    }
}

