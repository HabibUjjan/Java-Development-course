package com.Student.University;

public class BusinessUniversity implements University{
    @Override
    public void offerCourses() {
        System.out.println("Business University offers MBA, BBA, and other business management courses");
    }

    @Override
    public void conductExams() {
        System.out.println("Business University conducts written exams, group discussions, and interviews");
    }

    @Override
    public void provideScholarships() {
        System.out.println("Business University provides scholarships for top-performing students");

    }

    @Override
    public void hostEvents() {
        System.out.println("Business University hosts entrepreneurship competitions and networking events");

    }
}
