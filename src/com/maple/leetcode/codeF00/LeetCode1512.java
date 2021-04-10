package com.maple.leetcode.codeF00;

public class LeetCode1512 {
    public static void main(String[] args) {
        LeetCode1512 leet = new LeetCode1512();
        int[] nums = {1, 1, 1, 1};
        leet.numIdenticalPairs(nums);
    }

    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
