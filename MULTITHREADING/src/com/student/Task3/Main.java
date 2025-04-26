package com.student.Task3;

public class Main{
    public static void main(String[] args) {
        Thread t1 = new Thread(new ArrayReverse());
        Thread t2 = new Thread(new DuplicateElement());
        Thread t3 = new Thread(new MaximumElement());
        Thread t4 = new Thread(new NthLargestElement());
        Thread t5 = new Thread(new ArrayOddEven());

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}