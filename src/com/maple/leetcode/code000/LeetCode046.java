package com.maple.leetcode.code000;
/*
给定一个没有重复数字的序列，返回其所有可能的全排列。

示例:

输入: [1,2,3]
输出:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]
 */

import java.util.*;

public class LeetCode046 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        permute(lists, nums, 0, nums.length - 1);
        return lists;
    }

    private void permute(List<List<Integer>> lists, int[] nums, int l, int r) {
        if (l == r) {
            List<Integer> integers = new ArrayList<>();
            for (Integer n : nums) {
                integers.add(n);
            }
            lists.add(integers);
        }

        for (int i = l; i <= r; i++) {
            swap(nums, l, i);
            permute(lists, nums, l + 1, r);
            swap(nums, l, i);
        }
    }

    private void swap(int[] nums, int l, int r) {
        int t = nums[l];
        nums[l] = nums[r];
        nums[r] = t;
    }

    public static void main(String[] args) {
        LeetCode046 leet = new LeetCode046();
        int[] nums = {1, 2, 3, 4};
        List<List<Integer>> lists = leet.permute(nums);
        System.out.println(lists);
    }
}
