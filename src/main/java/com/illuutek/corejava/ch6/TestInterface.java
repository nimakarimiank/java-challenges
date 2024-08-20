package com.illuutek.corejava.ch6;

public interface TestInterface {
    private static String print(Object object){return object.toString();}
    static String printPublic(Object object){return print(object);}
}
