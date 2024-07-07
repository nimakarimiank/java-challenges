package com.illuutek.hackerrank.loops2;

import java.util.Scanner;

public class LoopsTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int[] results = new int[n];
            for (int j = 0; j < n; j++) {
                if (j == 0) results[j] = a + (int) (Math.pow(2, j) * b);
                else results[j] = results[j - 1] + (int) (Math.pow(2, j) * b);
                System.out.print(results[j]+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
