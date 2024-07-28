package com.illuutek;

import com.illuutek.corejava.ch4.Employee;
import com.illuutek.corejava.ch5.Manager;
import com.illuutek.leetcode.Solution;

import java.math.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int res = 5/ 2;

        System.out.println(res);
        solution.findMedianSortedArrays(new int[]{1}, new int[]{3,4});
    }
    private static void testArbitraryParams(int... a){
        System.out.println(a.length);

    }
}
