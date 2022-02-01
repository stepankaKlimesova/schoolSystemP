package com.example.schoolsystem;

public class Student {

    private String name;
    private Subjects subjects;
    private int grades;

    public Student(String name, Subjects subjects, int grades) {
        this.name = name;
        this.subjects = subjects;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subjects getSubjects() {
        return subjects;
    }

    public void setSubjects(Subjects subjects) {
        this.subjects = subjects;
    }

    public int getGrades() {
        return grades;
    }

    public void setGrades(int grades) {
        this.grades = grades;
    }
}
