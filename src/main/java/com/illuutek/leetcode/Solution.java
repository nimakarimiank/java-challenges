package com.illuutek.leetcode;

import java.util.*;

public class Solution {
    //DONE
    public static boolean isPalindrome(int x) {
        List<Integer> digitArray = new ArrayList<>();
        boolean res = false;
        if (x == 0) return true;
        while (x > 0) {
            int digit = x % 10;
            digitArray.add(digit);
            x /= 10;
        }
        digitArray = digitArray.reversed();
        System.out.println(digitArray);
        int range = digitArray.size();
        for (int i = 0; i < range; i++) {
            if (Objects.equals(digitArray.get(i), digitArray.get(range - 1 - i))) {
                res = true;
                continue;
            } else {
                res = false;
                return res;
            }
        }
        return res;
    }
    //DONE
    public int[] twoSumVersion1(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
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
    //DONE
    // Higher Memory Efficiency Lower RunTime Efficiency
    public int[] twoSumVersion2(int[] nums, int target) {
        int sum = 0;
        int[] res = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if (sum == target) {
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }
        System.gc();
        return res;
    }
    //TODO NOT DONE YET
    public static int lengthOfLongestSubstring(String s) {
        ArrayList<String> subStrings = new ArrayList<>();
        StringBuilder sub = new StringBuilder();
        for (var elem : s.toCharArray()) {
            var isIndex = sub.indexOf(String.valueOf(elem));
            if (isIndex == -1) {
                sub.append(elem);
            } else {
                subStrings.add(sub.toString());
                sub.delete(0, sub.length());
                sub.append(elem);
                continue;
            }

            subStrings.add(sub.toString());

        }

        System.out.println(subStrings.stream().max(Comparator.comparingInt(String::length)).orElse(""));
        return subStrings.stream().max(Comparator.comparingInt(String::length)).orElse("").length();
    }
    //DONE
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] summed = new int[nums1.length+nums2.length];
        System.arraycopy(nums1,0,summed,0,nums1.length);
        System.arraycopy(nums2,0,summed,nums1.length,nums2.length);
        summed = Arrays.stream(summed).sorted().toArray();
        var isEven = summed.length % 2 == 0;
        return isEven? (double) (summed[(summed.length / 2)-1] + summed[(summed.length / 2)]) /2:summed[(summed.length/2)];
    }
}
