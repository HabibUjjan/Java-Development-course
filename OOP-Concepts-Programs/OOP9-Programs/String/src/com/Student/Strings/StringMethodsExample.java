package com.Student.Strings;

import java.util.Scanner;

public class StringMethodsExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String input = scanner.nextLine();

        String lower = input.toLowerCase();
        String upper = input.toUpperCase();
        int length = input.length();
        char firstChar = input.charAt(0);
        int indexOfA = input.indexOf('a');
        int lastIndexOfA = input.lastIndexOf('a');
        String substring = input.substring(0, 3);
        boolean startsWith = input.startsWith("Hello");
        boolean endsWith = input.endsWith("world");
        boolean contains = input.contains("example");
        boolean isEmpty = input.isEmpty();
        String trimmed = input.trim();
        String replaced = input.replace('a', 'e');
        String[] split = input.split(" ");
        boolean equals = input.equals("sample");

        System.out.println("Lowercase: " + lower);
        System.out.println("Uppercase: " + upper);
        System.out.println("Length: " + length);
        System.out.println("First character: " + firstChar);
        System.out.println("Index of 'a': " + indexOfA);
        System.out.println("Last index of 'a': " + lastIndexOfA);
        System.out.println("Substring (0,3): " + substring);
        System.out.println("Starts with 'Hello': " + startsWith);
        System.out.println("Ends with 'world': " + endsWith);
        System.out.println("Contains 'example': " + contains);
        System.out.println("Is empty: " + isEmpty);
        System.out.println("Trimmed: " + trimmed);
        System.out.println("Replaced 'a' with 'e': " + replaced);
        System.out.println("Split (first word): " + split[0]);
        System.out.println("Equals 'sample': " + equals);
    }
}

