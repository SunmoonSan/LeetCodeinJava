package com.maple.leetcode.code000;

public class LeetCode053 {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum > 0) {
                sum += nums[i];
            } else {
                sum = nums[i];
            }

            max = Math.max(max, sum);
        }

        return max;

    }

    public static void main(String[] args) {
        LeetCode053 leet = new LeetCode053();
//        int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] a = {-1, 3, -2, 4, -6, 1, 6, -1};
        int s = leet.maxSubArray(a);
        System.out.println(s);
    }
}
