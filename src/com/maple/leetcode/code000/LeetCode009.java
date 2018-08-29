package com.maple.leetcode.code000;
/*
判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
示例 1:
输入: 121
输出: true

示例 2:
输入: -121
输出: false
解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。

示例 3:
输入: 10
输出: false
解释: 从右向左读, 为 01 。因此它不是一个回文数。
进阶:
你能不将整数转为字符串来解决这个问题吗？
*/

public class LeetCode009 {
    public boolean isPalindrome(int x) {
        if (x < 0) { // 负数必然不是回文数
            return false;
        } else if (x < 10) {  // 0~9中间的数必然是回文数
            return true;
        }

        // 将大于等10的数转换为字符串
        String s = String.valueOf(x);
        char[] nums = s.toCharArray();

        int i = 0;  // 左索引
        int j = nums.length - 1;  // 右索引

        while (i < j) {
            if (nums[i] != nums[j]) {  // 若左索引的值和右索引的值不等,则不是回文数
                return false;
            } else {  // 左索引右移, 右索引左移
                i++;
                j--;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        LeetCode009 leet = new LeetCode009();
        boolean b = leet.isPalindrome(121);
        System.out.println(b);
    }
}
