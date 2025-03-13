package com.Student.University;

public class ArtsUniversity implements University{
    @Override
    public void offerCourses() {
        System.out.println("Arts University offers courses in literature, history, psychology, and fine arts");

    }

    @Override
    public void conductExams() {
        System.out.println("Arts University conducts exams twice a year for its students");

    }

    @Override
    public void provideScholarships() {
        System.out.println("Arts University offers scholarships for art students and academic achievers");

    }

    @Override
    public void hostEvents() {
        System.out.println("Arts University organizes cultural festivals, drama performances, and art exhibitions");

    }
}
