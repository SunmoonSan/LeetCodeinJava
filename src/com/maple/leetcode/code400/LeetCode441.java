package com.maple.leetcode.code400;
/*
 * @desc : Created by San on 2019-05-05 13:52
 */

public class LeetCode441 {
    public int arrangeCoins(int n) {
        int left = 1;
        int right = n;
        while (left < right) {

            int sumSmall = (left + right - 1) * (right - 1) / 2;
            int sumBig = (left + right) * right / 2;

        }

        return 0;
    }

    public static void main(String[] args) {
        LeetCode441 leet = new LeetCode441();
        int n = leet.arrangeCoins(5);
        System.out.println(n);
    }
}
