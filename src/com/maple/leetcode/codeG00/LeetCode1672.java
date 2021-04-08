package com.maple.leetcode.codeG00;

public class LeetCode1672 {
    public static void main(String[] args) {
        LeetCode1672 leet = new LeetCode1672();
        int[][] nums = {{1, 5}, {7, 3}, {3, 5}};
        int max = leet.maximumWealth(nums);
        System.out.println(max);
    }

    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (max < sum) {
                max = sum;
            }
        }
        return max;
    }
}
