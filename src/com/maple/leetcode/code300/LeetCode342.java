package com.maple.leetcode.code300;

public class LeetCode342 {
    public boolean isPowerOfFour(int num) {
        if (num <= 0) {
            return false;
        }

        if (num == 1) {
            return true;
        }

        return (num - 1) % 4 == 3;
    }

    public static void main(String[] args) {
        LeetCode342 leet = new LeetCode342();
        boolean b = leet.isPowerOfFour(4);
        System.out.println(b);
    }
}
