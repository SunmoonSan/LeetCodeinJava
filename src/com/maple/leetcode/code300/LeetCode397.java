package com.maple.leetcode.code300;

public class LeetCode397 {
    public int integerReplacement(int n) {
        if (n == 1) {
            return 0;
        } else if (n == Integer.MAX_VALUE) {
            return 32;
        }

        if (n % 2 == 0) {
            return 1 + integerReplacement(n / 2);
        } else {
            return 1 + Math.min(integerReplacement(n - 1), integerReplacement(n + 1));
        }
    }

    public static void main(String[] args) {
        LeetCode397 leet = new LeetCode397();
        System.out.println(Integer.MAX_VALUE);
        int n = leet.integerReplacement(2147483647);
        System.out.println(n);
    }
}
