package com.maple.leetcode.code100;

public class LeetCode162 {
    public int findPeakElement(int[] nums) {
        int max = nums[0];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= max) {
                max = nums[i];
                index = i;

                if (index == nums.length - 1) {
                    return index;
                }
            }

            if (nums[i + 1] < max) {
                return index;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        LeetCode162 leet = new LeetCode162();
        int[] a = {1};
        int index = leet.findPeakElement(a);
        System.out.println(index);
    }
}
