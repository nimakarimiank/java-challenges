package com.illuutek.corejava.ch4;

import java.time.LocalDate;

public class Employee {

    private final String name;
    private double salary;
    private LocalDate hireDay = LocalDate.now();
    public Employee(){}
    public Employee(String n, double s, int year, int month, int
            day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double percentage) {
        double raise = salary / percentage * 100;
        salary += raise;

    }

}
