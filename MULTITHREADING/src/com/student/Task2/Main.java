package com.student.Task2;


public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ConversionTasks(1));
        Thread t2 = new Thread(new ConversionTasks(2));
        Thread t3 = new Thread(new ConversionTasks(3));
        Thread t4 = new Thread(new ConversionTasks(4));
        Thread t5 = new Thread(new ConversionTasks(5));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}

