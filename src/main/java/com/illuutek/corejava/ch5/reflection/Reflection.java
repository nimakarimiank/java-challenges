package com.illuutek.corejava.ch5.reflection;

import com.illuutek.corejava.ch5.Manager;

import java.net.URL;

public class Reflection {
    public static void main(String[] args) {
        Class<Manager> c1 = Manager.class;
        URL resourceUrl = c1.getResource("image.png");

    }


}
