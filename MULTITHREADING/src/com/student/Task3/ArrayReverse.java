package com.student.Task3;

import java.util.Scanner;
class ArrayReverse implements Runnable {
    public void run() {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Enter array elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("ARRAY ELEMENTS ARE: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }

        System.out.println("ARRAY REVERSE ELEMENTS ARE");
        for (int k = array.length - 1; k >= 0; k--) {
            System.out.println(array[k]);
        }
        System.out.println();
    }
}

class DuplicateElement implements Runnable {
    public void run() {
        int[] myArray = {5, 1, 2, 7, 2, 6, 1};
        System.out.println("Original Array:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println("\nFirst Duplicate element is:");
        for (int i = 0; i < myArray.length; i++) {
            int count = 0;
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] == myArray[j]) {
                    count = count + 1;
                    System.out.println(myArray[j]);
                    break;
                }
            }
            if (count > 0) {
                break;
            }
        }
        System.out.println();
    }
}


class MaximumElement implements Runnable {
    public void run() {
        int[] myArray = {5, 1, 2, 7, 6};
        int max = myArray[0];
        System.out.println("Original Array:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        for (int i = 1; i < myArray.length; i++) {
            if (max < myArray[i]) {
                max = myArray[i];
            }
        }
        System.out.println("\nMaximum Element is " + max);
        System.out.println();
    }
}


class NthLargestElement implements Runnable {
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Largest element, 2 for Second Largest, 3 for 3rd Largest:");
        int num = sc.nextInt();
        int temp = 0;
        int[] myArray = {5, 1, 2, 7, 6};
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] < myArray[j]) {
                    temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        if (num == 1) {
            System.out.println("1st Largest Element " + myArray[0]);
        } else if (num == 2) {
            System.out.println("2nd Largest Element " + myArray[1]);
        } else if (num == 3) {
            System.out.println("3rd Largest Element " + myArray[2]);
        }
        System.out.println();
    }
}

class ArrayOddEven implements Runnable {
    public void run() {
        int[] array = {1, 2, 5, 6, 3, 2};
        System.out.println("Odd Numbers:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }
        System.out.println("Even Numbers:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
        System.out.println();
    }
}



