package com.maple.leetcode.code200;
/*
给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
示例 1:
输入: [3,0,1]
输出: 2

示例 2:
输入: [9,6,4,2,3,5,7,0,1]
输出: 8
说明:
你的算法应具有线性时间复杂度。你能否仅使用额外常数空间来实现?
*/

public class LeetCode268 {
    public int missingNumber(int[] nums) {
        int[] dict = new int[nums.length + 1];  // 元素字典

        // 有该元素,统计+1
        for (int i = 0; i < nums.length; i++) {
            dict[nums[i]]++;
        }

        // 遍历字典,找出元素为0的位置
        for (int i = 0; i < dict.length; i++) {
            if (dict[i] == 0) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        LeetCode268 leet = new LeetCode268();
        int[] nums = {9,6,4,2,3,5,7,0,1};
        int miss = leet.missingNumber(nums);
        System.out.println(miss);
    }
}
