package com.maple.leetcode.codeI00;

public class LeetCode1822 {
    public static void main(String[] args) {
        LeetCode1822 leet = new LeetCode1822();
        int[] nums = {-1, 0, -3, -4, 3, 2, 1};
        int n = leet.arraySign(nums);
        System.out.println(n);
    }

    public int arraySign(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            }
            if (nums[i] < 0) {
                count++;
            }
        }
        return count % 2 == 0 ? 1 : -1;
    }
}
