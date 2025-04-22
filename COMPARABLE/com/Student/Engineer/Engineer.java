package com.Student.Engineer;

public class Engineer implements Comparable<Engineer>{
    String name;
    int salary;

    Engineer(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Engineer engineer) {
        int nameCompare = this.name.compareTo(engineer.name);
        if (nameCompare != 0) {
            return nameCompare;
        } else {
            return this.salary - engineer.salary;
        }
    }


    @Override
    public String toString() {
        return "Engineer: Name = " + name + "," +" Salary = " + salary;
    }
}
