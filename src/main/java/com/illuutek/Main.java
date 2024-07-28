package com.illuutek;

import com.illuutek.leetcode.Solution;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Solution solution = new Solution();
        var res = solution.findMedianSortedArrays(new int[]{1}, new int[]{3, 4});
        System.out.println(res);
        String className = "com.illuutek.leetcode.Solution";
        Class<?> c1 = Class.forName(className);
        System.out.println(c1.getCanonicalName());
    }

    private static void testArbitraryParams(int... a) {
        System.out.println(a.length);
    }
}