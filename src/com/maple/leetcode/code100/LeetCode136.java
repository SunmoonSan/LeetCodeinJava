package com.maple.leetcode.code100;

public class LeetCode136 {
    int only;
    public int singleNumber(int[] nums) {
        for (int i=0;i<nums.length;i++) {
            only = nums[i];
            if (only==nums[i+1]) {

            } else {
                i++;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        LeetCode136 leet = new LeetCode136();
        int[] a = {2, 2, 1};
        leet.singleNumber(a);
    }
}
