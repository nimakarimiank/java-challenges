package com.illuutek.leetcode.TwoSum_DONE;

import java.util.HashMap;
import java.util.Map;

class Solution {
    //Higher RunTime efficiency Lower Memory Efficiency
    public int[] twoSumVersion1(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<Integer,Integer>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[]{}; // No solution found
    }
    // Higher Memory Efficiency Lower RunTime Efficiency
    public int[] twoSumVersion2(int[] nums, int target)
    {
        int sum=0;
        int[] res = new int[2];
        for (int i=0; i<nums.length-1; i++)
        {
            for (int j=i+1; j<nums.length; j++)
            {
                sum=nums[i]+nums[j];
                if (sum==target)
                {
                    res[0]=i;
                    res[1]=j;
                    break;
                }
            }
        }
        System.gc();
        return res;
    }
}
