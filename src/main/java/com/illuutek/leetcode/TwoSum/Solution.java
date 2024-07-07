package com.illuutek.leetcode.TwoSum;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
//        int[] sortedNums = Arrays.stream(nums).sorted().toArray();
        int cuttingIndex = removeLargerThanTarget(nums, target);
        int[] newNum = Arrays.copyOf(nums, cuttingIndex);
        System.out.println(Arrays.toString(newNum));
        int sum = 0;
        int[] indexes = new int[newNum.length];
        for (int i = 0; i < newNum.length; i++) {
            sum += newNum[i];
            indexes[i] = i;
            if (sum > target) {
                sum = 0;
                indexes[i] = -1;
                break;
            }
        }
        indexes = Arrays.stream(indexes).filter(e -> e != -1).toArray();
        return indexes;
    }


    private int removeLargerThanTarget(@NotNull int[] nums, int target) {
        int slowPointer = 0;
        int fastPointer = 0;
        while (fastPointer < nums.length) {
            if (nums[fastPointer] < target) {
                nums[slowPointer] = nums[fastPointer];
                slowPointer++;
            }
            fastPointer++;
        }
        return slowPointer;
    }
}
