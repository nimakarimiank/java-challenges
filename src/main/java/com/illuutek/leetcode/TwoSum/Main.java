package com.illuutek.leetcode.TwoSum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] indexes = solution.twoSumVersion2(new int[]{0,4,3,0}, 0);
        System.out.println(Arrays.toString(indexes));
    }
}
