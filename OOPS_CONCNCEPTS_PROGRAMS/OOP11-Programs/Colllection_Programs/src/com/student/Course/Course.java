package com.student.Course;

class Course {
    private String name;
    private int duration;
    private double fees;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public double getFees() {
        return fees;
    }

    @Override
    public String toString() {
        return "Course Name: " + name + ", Duration: " + duration + " months, Fees: " + fees;
    }
}