package com.springexamplesetget;

public class Student {
    private Grades grades;
    public void setGrades(Grades grades) {
        this.grades = grades;
    }
    public Grades getGrades() {
        return grades;
    }
    public void retrieveGrades() {
        grades.getGrades();
    }
}
