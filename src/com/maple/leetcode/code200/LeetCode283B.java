package com.maple.leetcode.code200;

public class LeetCode283B {
    public void moveZeroes(int[] nums) {
        int index = 0; // 记录前面不为0位置

        // 从前往后遍历,将所有不为0的数字依次前移
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int t = nums[index];
                nums[index] = nums[i];
                nums[i] = t;
                index++;
            }
        }

    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        LeetCode283B leet = new LeetCode283B();
        leet.moveZeroes(nums);
    }
}
