package com.maple.leetcode.code100;

public class LeetCode198 {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int a = nums[0];
        int b = nums[1];
        for (int i = 2; i < nums.length; i++) {
            int c = Math.max(a + nums[i], b);
            a = Math.max(a, b);
            b = c;
        }
        return b;
    }
}

