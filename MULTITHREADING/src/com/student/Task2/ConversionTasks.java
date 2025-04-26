package com.student.Task2;


class ConversionTasks implements Runnable {
    private int taskId;
    public ConversionTasks(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        switch (taskId) {
            case 1:
                centiToMilli();
                break;
            case 2:
                kilogramToMann();
                break;
            case 3:
                meterToCentimeter();
                break;
            case 4:
                kiloToGrams();
                break;
            case 5:
                hoursToMinutes();
                break;
        }
    }

    public void centiToMilli() {
        float centi = 50;
        float milli = centi * 10;
        System.out.println("Millimeter will be: " + milli);
        float milli1 = 4000;
        float centi1 = milli1 / 10;
        System.out.println("Centimeter will be: " + centi1);
        System.out.println();
    }

    public void kilogramToMann() {
        int kilogram = 400;
        int mann = kilogram / 40;
        System.out.println("Mann will be: " + mann);
        int gram = 2000;
        int kilogram1 = gram / 1000;
        System.out.println("Kilograms will be: " + kilogram1);
        System.out.println();
    }


    public void meterToCentimeter() {
        long meter = 50;
        long centimeter = meter * 100;
        System.out.println("Centimeter will be: " + centimeter);
        long centimeter1 = 600;
        long meter1 = centimeter1 / 100;
        System.out.println("Meter will be: " + meter1);
        System.out.println();
    }


    public void kiloToGrams() {
        int kg = 5;
        int grams = kg * 1000;
        System.out.println("Grams will be: " + grams);
        int gram = 2000;
        int kilogram = gram / 1000;
        System.out.println("Kilograms will be: " + kilogram);
        System.out.println();
    }

    public void hoursToMinutes() {
        long hours = 5;
        long minutes = hours * 60;
        System.out.println("Minutes will be: " + minutes);
        int mint = 240;
        int hour = mint / 60;
        System.out.println("Hours will be: " + hour);
        System.out.println();
    }
}
