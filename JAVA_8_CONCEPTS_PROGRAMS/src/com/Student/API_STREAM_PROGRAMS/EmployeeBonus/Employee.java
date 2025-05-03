package com.Student.API_STREAM.EmployeeBonus;


class Employee {
    private String name;
    private double salary;
    private String performance;

    public Employee(String name, double salary, String performance) {
        this.name = name;
        this.salary = salary;
        this.performance = performance;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getPerformance() {
        return performance;
    }
    public double calculateBonus() {
        double bonusPercentage = 0;
        switch (performance.toLowerCase()) {
            case "excellent":
                bonusPercentage = 0.20;
                break;
            case "good":
                bonusPercentage = 0.10;
                break;
            case "average":
                bonusPercentage = 0.05;
                break;
            default:
                bonusPercentage = 0.02;
                break;
        }
        return salary * bonusPercentage;
    }

    public void displayInfo() {
        System.out.println("Employee: " + name);
        System.out.println("Salary  : " + salary);
        System.out.println("Performance: " + performance);
        System.out.println("Bonus: " + calculateBonus());
        System.out.println();
    }
}



