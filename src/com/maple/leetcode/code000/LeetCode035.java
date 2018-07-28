package com.maple.leetcode.code000;
/*
给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
你可以假设数组中无重复元素。
示例 1:
输入: [1,3,5,6], 5
输出: 2

示例 2:
输入: [1,3,5,6], 2
输出: 1

示例 3:
输入: [1,3,5,6], 7
输出: 4

示例 4:
输入: [1,3,5,6], 0
输出: 0
 */

public class LeetCode035 {
    public int searchInsert(int[] nums, int target) {
        int[] nums2 = new int[nums.length + 1];
        nums2[nums.length] = target;
        for (int i = 0; i < nums.length; i++) {
            nums2[i] = nums[i];
        }

        // 比第1个小,从0开始全部后移
        if (target<nums2[0]) {
            for (int i=nums2.length-2;i>=0; i--) {
                nums2[i+1] = nums2[i];
            }
            nums2[0] = target;
        }

        // 从大到小, 大于target则后移1位
        for (int i=nums2.length-2;i>=0;i--) {
            if (target>nums2[i]) { // 比最后大元素大, 放在数组最后1位
                return i+1;
            } else if (target==nums2[i]) {  // 相等
                return i;
            } else { // target变nums2[i]大
                nums2[i+1] = nums[i];
                nums[i] = target;
            }
        }


        return nums.length - 1;
    }

    public static void main(String[] args) {
        LeetCode035 leet = new LeetCode035();
        int[] a = {1, 3, 5, 6};
        System.out.println(leet.searchInsert(a, 0));
    }
}
