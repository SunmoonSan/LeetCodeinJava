package com.maple.leetcode.code000;
/*
给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。

示例:
给定 nums = [2, 7, 11, 15], target = 9

因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
*/

import java.util.HashMap;
import java.util.Map;

public class LeetCode001 {
    /*public int[] twoSum(int[] nums, int target) {
        int[] t = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    t[0] = i;
                    t[1] = j;
                }
            }
        }
        return t;
    }*/

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], 0);

        int[] indexs = new int[2];
        for (int i = 1; i < nums.length; i++) {
            int other = target - nums[i];
            if (map.containsKey(other)) {

                indexs[0] = map.get(other);
                indexs[1] = i;
                return indexs;
            } else {
                map.put(nums[i], i);
            }
        }

        return indexs;
    }
}
