package com.maple.leetcode.code600;

public class LeetCode633 {
    public boolean judgeSquareSum(int c) {
        int l = 0;
        int r = (int) Math.sqrt(c);
        while (l <= r) {
            int s = l * l + r * r;
            if (s == c) {
                return true;
            }

            if (s > c) {
                r--;
            } else {
                l++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LeetCode633 leet = new LeetCode633();
        System.out.println(leet.judgeSquareSum(3));
    }
}
