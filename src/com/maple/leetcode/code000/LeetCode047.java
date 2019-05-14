package com.maple.leetcode.code000;
/*
给定一个可包含重复数字的序列，返回所有不重复的全排列。
示例:
输入: [1,1,2]
输出:
[
  [1,1,2],
  [1,2,1],
  [2,1,1]
]
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode047 {
    public List<List<Integer>> permuteUnique(int[] nums) {
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

        Set<Integer> set = new HashSet<>();
        for (int i = l; i <= r; i++) {
            if (set.contains(nums[i])) {
                continue;
            } else {
                set.add(nums[i]);
            }
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
        LeetCode047 leet = new LeetCode047();
        int[] nums = {2, 2, 1};
        List<List<Integer>> lists = leet.permuteUnique(nums);
        System.out.println(lists);
    }
}
