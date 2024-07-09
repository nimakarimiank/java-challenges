package com.illuutek.leetcode.TwoSum;

import java.util.Arrays;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum = 0;
        int[] newNum = removeLargerThanTarget(nums, target);
        int[] indexes = new int[newNum.length];
        Arrays.fill(indexes, -1);
        for (int i = 0; i < newNum.length; i++) {
            sum += newNum[i];
            var remainder = target - sum;
            int index;
            if (remainder == newNum[i]){
                index = Arrays.binarySearch(newNum,i+1,newNum.length,remainder);
            }
            else {
                index=Arrays.binarySearch(newNum,remainder);
            }
            if (index>=0){
                indexes[index] = index;
                indexes[i]= i;
                break;
            }
            else {
                sum = 0;
            }
        }
        indexes = Arrays.stream(indexes).filter(e -> e != -1).toArray();
        return indexes;
    }


    private int[] removeLargerThanTarget(int[] nums, int target) {
        return Arrays.stream(nums).toArray();
    }
}
