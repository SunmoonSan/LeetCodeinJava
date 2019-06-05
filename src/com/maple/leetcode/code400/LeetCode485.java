package com.maple.leetcode.code400;
/*
给定一个二进制数组， 计算其中最大连续1的个数。

示例 1:
输入: [1,1,0,1,1,1]
输出: 3
解释: 开头的两位和最后的三位都是连续1，所以最大连续1的个数是 3.
注意：

输入的数组只包含 0 和1。
输入数组的长度是正整数，且不超过 10,000。
 */

public class LeetCode485 {
    public int findMaxConsecutiveOnes(int[] nums) {
//        int max = 0;
//        int sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 1) {
//                sum += 1;
//            } else {
//                sum = 0;
//            }
//
//            max = Math.max(max, sum);
//        }
//        return max;

        int index = -1;
        int max = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                sum = i - index - 1;
                index = i;
            }

            if (sum > max) {
                max = sum;
            }
        }

        if (nums.length - 1 - index > max) {
            max = nums.length - 1 - index;
        }

        return max;
    }

    public static void main(String[] args) {
        LeetCode485 leet = new LeetCode485();
        int[] s = {1, 0, 1, 1, 0, 1};
        leet.findMaxConsecutiveOnes(s);
    }
}
