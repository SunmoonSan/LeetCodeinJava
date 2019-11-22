package com.maple.leetcode.code000;

public class LeetCode075 {
    public void sortColors(int[] nums) {
        int l = -1;
        int r = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                l++;
                swap(nums, l, i);
            }
            if (nums[i] == 1) {

            }
            if (nums[i] == 2) {
                r--;
                while (l < r && nums[r] == 2) {
                    r--;
                }
                swap(nums, i, r);
            }
        }

        System.out.println(nums);
    }

    private void swap(int[] nums, int a, int b) {
        int t = nums[a];
        nums[a] = nums[b];
        nums[b] = t;
    }

    public static void main(String[] args) {
        LeetCode075 leet = new LeetCode075();
        int[] a = {2, 0, 2, 1, 1, 0};
//        int[] a = {0, 0};
        leet.sortColors(a);
    }
}
