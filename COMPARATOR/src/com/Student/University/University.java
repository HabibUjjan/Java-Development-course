package com.Student.University;

import java.util.Comparator;

public class University {
    String name;
    int studentsCount;

    public University(String name, int studentsCount) {
        this.name = name;
        this.studentsCount = studentsCount;
    }

    @Override
    public String toString() {
        return "University Name: " + name + ", Students Count: " + studentsCount;
    }


    public static Comparator<University> studentsCountComparator = new Comparator<University>() {
        @Override
        public int compare(University university1, University university2) {
            return university1.studentsCount - university2.studentsCount;
        }
    };
}

