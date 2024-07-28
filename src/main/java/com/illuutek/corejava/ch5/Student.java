package com.illuutek.corejava.ch5;

public class Student extends Person {
    private String major;

    public Student(String major, String name) {
        super(name);
        this.major = major;
    }

    @Override
    public String getDescription() {
        return "a student majoring in " + major;
    }
}
