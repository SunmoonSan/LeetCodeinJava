package com.maple.leetcode.codeB00;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1313 {
    public static void main(String[] args) {
        LeetCode1313 leet = new LeetCode1313();
        int[] nums = {1, 1, 2, 3};
        leet.decompressRLElist(nums);
    }

    public int[] decompressRLElist(int[] nums) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 1; i < nums.length; i = i + 2) {
            for (int j = 0; j < nums[i - 1]; j++) {
                integers.add(nums[i]);
            }
        }
        int[] arr = new int[integers.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = integers.get(i);
        }
        return arr;
    }
}
