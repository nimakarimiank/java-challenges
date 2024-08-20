package com.illuutek.corejava.ch6;

public class TestClass implements TestInterface{
//    public String toSt(Object object){ return print(object);} -- IMPOSSIBLE SINCE PRINT IS PRIVATE
    public String toSt(Object object){ return TestInterface.printPublic(object);} //-- POSSIBLE

}
