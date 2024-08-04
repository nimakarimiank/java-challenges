package com.illuutek;

import com.illuutek.hackerrank.loops2.LoopsTwo;
import com.illuutek.leetcode.Solution;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        reflection();
    }
    private static void testArbitraryParams(int... a) {
        System.out.println(a.length);
    }
    private static void reflection() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Solution solution = new Solution();
        Class<?> ref = solution.getClass();
        System.out.println("Class Name:\t"+ref.getName() + "\tCanonical Name:\t" + ref.getCanonicalName());
        Class<?> refBuiltFromString = Class.forName("com.illuutek.leetcode.Solution");
        Class<?> thirdWayToBuildClassObj = LoopsTwo.class;
        System.out.println(thirdWayToBuildClassObj.getName());
        Class<?> arrayTypeClass = double[].class;
        Object constructObjFromClassObj = refBuiltFromString.getConstructor().newInstance();
        Solution sol = (Solution)constructObjFromClassObj;
        System.out.println(sol.toString());

    }
}