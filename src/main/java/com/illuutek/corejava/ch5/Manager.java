package com.illuutek.corejava.ch5;

import com.illuutek.corejava.ch4.Employee;

public class Manager extends Employee
{
    private double bonus;

    public Manager(String n, double s,double b, int year, int month, int day) {
        super(n, s, year, month, day);
        this.bonus = b;
    }
    public double getSalary(){
        double salary = super.getSalary();
        return salary + bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o))return false;
        if (o instanceof Manager manager){
            return Double.compare(this.bonus, manager.bonus) == 0;
        }
        else return false;
    }
}
