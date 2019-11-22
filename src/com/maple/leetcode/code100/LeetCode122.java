package com.maple.leetcode.code100;

import java.util.Arrays;

public class LeetCode122 {
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            int[] left = Arrays.copyOfRange(prices, 0, i);
            int[] right = Arrays.copyOfRange(prices, i + 1, prices.length);
            max = Math.max(max, maxProfit(left, i) + maxProfit(right, i));
        }
        return max;
    }

    private int maxProfit(int[] prices, int t) {
        int minLeft = Integer.MAX_VALUE;
        int maxLeft = 0;
        for (int i = 0; i <= t; i++) {
            minLeft = Math.min(minLeft, prices[i]);
            maxLeft = Math.max(maxLeft, prices[i] - minLeft);
        }

        int minRight = Integer.MAX_VALUE;
        int maxRight = 0;
        for (int j = t + 1; j < prices.length; j++) {
            minRight = Math.min(minRight, prices[j]);
            maxRight = Math.max(maxRight, prices[j] - minRight);
        }

        return maxLeft + maxRight;
    }

    public static void main(String[] args) {
        LeetCode122 leet = new LeetCode122();
        int[] a = {3, 3, 5, 0, 0, 3, 1, 4};
        int s = leet.maxProfit(a);
        System.out.println(s);
    }
}
