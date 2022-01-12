package com.maple.leetcode.code000;

public class LeetCode075 {
    public void sortColors(int[] nums) {
        int t = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int j = i + 1;
                while (j < nums.length && nums[j] != 0) {
                    j++;
                }
                if (j < nums.length && nums[j] == 0) {
                    t = nums[i];
                    nums[i] = nums[j];
                    nums[j] = t;
                }
            }
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != 2) {
                int j = i - 1;
                while (j >= 0 && nums[j] != 2) {
                    j--;
                }
                if (j >= 0 && nums[j] == 2) {
                    t = nums[i];
                    nums[i] = nums[j];
                    nums[j] = t;
                }
            }
        }
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
