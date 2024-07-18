package com.illuutek.corejava.ch5;

import com.illuutek.corejava.ch4.Employee;

public class Chapter5{
    public static void main(String[] args) {
        Employee manager = new Manager("nima",250002,100002,2021,12,21);
        Employee secondManager = new Manager("nima2",25000,10000,2021,12,21);
        System.out.println(manager.getSalary());
        if (manager.equals(secondManager)) System.out.println("HIIII");

    }
}
