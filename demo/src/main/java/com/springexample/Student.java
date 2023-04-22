package com.springexample;

public class Student {
    /*Class for com.springexample.Student*/
    private Grades grades;
    public Student(Grades grades) {
        this.grades = grades;
    }
    public void retrieveGrades() {
        grades.getGrades();
    }
}
