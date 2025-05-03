package com.Student.API_STREAM.StudentGrade;

class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
    public String getGrade(){
        if(marks>=90){
            return "A+";
        }
        else if (marks>=80) {
            return "A";
        } else if (marks>=70) {
            return "B+";
        } else if (marks>=60) {
            return "B";
        }else {
            return "C";
        }
    }
    public void displayInfo() {
        System.out.println("Name  : " + name);
        System.out.println("Marks : " + marks);
        System.out.println("Grade : " + getGrade());
        System.out.println();
    }
}
