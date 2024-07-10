package com.illuutek.leetcode.addtwonumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Palindrome {
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
            }
            else {
            res = false;
            return res;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(123321));
    }
}
