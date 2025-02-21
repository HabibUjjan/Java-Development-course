package com.Student.Strings;
import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence:");
        String sentence = scanner.nextLine();
        int vowelCount = 0;
        int consonantCount = 0;
        int spaceCount = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (Character.isLetter(c)) {
                if ("aeiouAEIOU".indexOf(c) != -1) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            } else if (Character.isWhitespace(c)) {
                spaceCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
        System.out.println("Number of spaces: " + spaceCount);
    }
}
