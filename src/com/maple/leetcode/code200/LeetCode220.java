package com.maple.leetcode.code200;

public class LeetCode220 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        for (int i = 0; i < nums.length; i++) {
            int j = i;
            boolean exist = true;
            while (j < nums.length && j - i <= k) {
                if (Math.abs(nums[i] - nums[j]) > t) {
                    exist = false;
                }
                j++;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        LeetCode220 leet = new LeetCode220();
        int[] a = {1, 2, 3, 1};
        boolean b = leet.containsNearbyAlmostDuplicate(a, 3, 0);
        System.out.println(b);
    }
}
