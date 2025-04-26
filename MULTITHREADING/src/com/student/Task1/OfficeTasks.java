package com.student.Task;


public class OfficeTasks implements Runnable {
    int taskId;
    public OfficeTasks(int taskId) {
        this.taskId = taskId;
    }
    @Override
    public void run() {
        switch (taskId) {
            case 1:
                printDocuments();
                break;
            case 2:
                cleanOffice();
                break;
            case 3:
                deliverPackages();
                break;
            case 4:
                provideCustomerSupport();
                break;
            case 5:
                finishWork();
                break;
        }
    }

    private void printDocuments() {
        System.out.println("Printing documents...");
        try {
            Thread.sleep(1300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Documents printed successfully");
    }

    public void cleanOffice() {
        System.out.println("Cleaning the office...");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }

        System.out.println("Office cleaned successfully");

    }

    public void deliverPackages() {
        System.out.println("Delivering packages...");
        try {
            Thread.sleep(4500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Packages delivered successfully");

    }

    public void provideCustomerSupport() {
        System.out.println("Providing customer support...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Customer support provided successfully");

    }

    public void finishWork() {
        System.out.println("Finishing work...");
        System.out.println();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work finished successfully");

    }
}

