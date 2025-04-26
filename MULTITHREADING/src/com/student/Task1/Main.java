package com.student.Task;

public class Main{
    public static void main(String[] args) {
        Thread t1 = new Thread(new OfficeTasks(1));
        Thread t2 = new Thread(new OfficeTasks(2));
        Thread t3 = new Thread(new OfficeTasks(3));
        Thread t4 = new Thread(new OfficeTasks(4));
        Thread t5 = new Thread(new OfficeTasks(5));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}

