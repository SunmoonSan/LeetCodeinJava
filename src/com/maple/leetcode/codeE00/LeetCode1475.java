package com.maple.leetcode.codeE00;

public class LeetCode1475 {
    public static void main(String[] args) {
        LeetCode1475 leet = new LeetCode1475();
        int[] prices = {10, 1, 1, 6};
        leet.finalPrices(prices);
    }

    public int[] finalPrices(int[] prices) {
        int[] nums = new int[prices.length];
        int index = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            int j = i + 1;
            while (j < prices.length) {
                if (prices[i] >= prices[j]) {
                    nums[index++] = prices[i] - prices[j];
                    break;
                }
                j++;
            }

            if (j == prices.length) {
                nums[index++] = prices[i];
            }
        }
        nums[prices.length - 1] = prices[prices.length - 1];
        return nums;
    }
}
