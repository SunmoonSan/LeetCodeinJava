package com.maple.leetcode.code600;

public class LeetCode697 {
    public int findShortestSubArray(int[] nums) {
        int[] dict = new int[5000];
        for (int i=0;i<nums.length;i++) {
            dict[nums[i]]++;
        }

        int max=-1;
        for (int i=0;i<dict.length;i++) {
            if (max<dict[i]) {
                max = dict[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        LeetCode697 leet = new LeetCode697();
        int[] n = {1,2,2,3,1,4,2};
        int m = leet.findShortestSubArray(n);
        System.out.println(m);
    }
}
