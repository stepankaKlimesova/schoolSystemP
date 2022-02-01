package com.example.schoolsystem;

public class Student {

    private String name;
    private Subjects subjects;

    public Student(String name, Subjects subjects) {
        this.name = name;
        this.subjects = subjects;
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

    @Override
    public String toString() {
        return name + " " + subjects;

    }
}
