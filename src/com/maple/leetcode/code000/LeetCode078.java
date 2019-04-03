package com.maple.leetcode.code000;
/*
给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。

说明：解集不能包含重复的子集。

示例:

输入: nums = [1,2,3]
输出:
[
  [1],
  [1,2],
  [1,2,3],
  [1,3],
  [2],
  [2,3],
  [3],
  []
]
 */

import java.util.ArrayList;
import java.util.List;

public class LeetCode078 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(new ArrayList<>());

        for (int i = 0; i < nums.length; i++) {
            List<List<Integer>> tempList = new ArrayList<>();
            for (int j = 0; j < lists.size(); j++) {
                List<Integer> integers = new ArrayList<>(lists.get(j));
                integers.add(nums[i]);
                tempList.add(integers);
            }
            lists.addAll(tempList);
        }
        return lists;
    }


    public static void main(String[] args) {
        LeetCode078 leet = new LeetCode078();
        int[] nums = {1, 2, 3};
        System.out.println(leet.subsets(nums));
    }
}
