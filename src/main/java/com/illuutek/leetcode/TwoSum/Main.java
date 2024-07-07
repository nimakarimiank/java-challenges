package com.illuutek.leetcode.TwoSum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] indexes = solution.twoSum(new int[]{2,7,11,15,123,42,1,5,3,5,12}, 9);
        System.out.println(Arrays.toString(indexes));
    }
}
