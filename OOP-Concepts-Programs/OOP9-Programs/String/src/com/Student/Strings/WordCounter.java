package com.Student.Strings;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence:");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");
        int wordCount = words.length;

        System.out.println("The number of words in the sentence is: " + wordCount);
    }
}
