package com.maple.leetcode.code000;

import java.util.ArrayList;
import java.util.List;

public class LeetCode060 {
    public String getPermutation(int n, int k) {
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }
        List<String> list = new ArrayList<>();
        getPermutation(list, nums, 0, "");

        return "";
    }

    private void getPermutation(List<String> list, int[] nums, int index, String res) {
        if (res.length() == nums.length) {
            System.out.println(res);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            getPermutation(list, nums, 0, res+nums[i]);
        }
    }

    private void swap(int[] nums, int l, int r) {
        int t = nums[l];
        nums[l] = nums[r];
        nums[r] = t;
    }

    public static void main(String[] args) {
        LeetCode060 leet = new LeetCode060();
        String s = leet.getPermutation(3, 5);
        System.out.println(s);
    }
}
