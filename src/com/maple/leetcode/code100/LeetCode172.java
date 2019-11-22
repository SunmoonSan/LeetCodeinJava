package com.maple.leetcode.code100;

public class LeetCode172 {
    public int trailingZeroes(int n) {
        int nums = 0;
        for (int i = 5; i <= n; i = i + 5) {
            long s = i;
            while (s % 5 == 0) {
                if (s % 15625 == 0) {
                    nums = nums + 6;
                    s = s / 125;
                } else if (s % 625 == 0) {
                    nums = nums + 4;
                    s = s / 625;
                } else if (s % 25 == 0) {
                    nums = nums + 2;
                    s = s / 25;
                } else {
                    nums++;
                    s = s / 5;
                }
                System.out.println(s);
            }
        }

        return nums;
    }

    public static void main(String[] args) {
//        19883539
        LeetCode172 leet = new LeetCode172();
        int s = leet.trailingZeroes(2147483647);
        System.out.println(s);
    }
}
