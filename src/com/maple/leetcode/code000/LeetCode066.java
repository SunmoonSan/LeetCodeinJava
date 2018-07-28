package com.maple.leetcode.code000;

/*
给定一个非负整数组成的非空数组，在该数的基础上加一，返回一个新的数组。
最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
你可以假设除了整数 0 之外，这个整数不会以零开头。

示例 1:
输入: [1,2,3]
输出: [1,2,4]
解释: 输入数组表示数字 123。

示例 2:
输入: [4,3,2,1]
输出: [4,3,2,2]
解释: 输入数组表示数字 4321。
 */

public class LeetCode066 {
    public int[] plusOne(int[] digits) {
        //123,268
        if (digits[digits.length - 1] < 9) {
            digits[digits.length - 1]++;
            return digits;
        }

        //9, 99, 999
        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }

        //9999,
        if (digits[0] != 9) {
            digits[0]++;
        } else {
            digits[0] = 0;
            int[] digit2 = new int[digits.length + 1];
            for (int i = digits.length - 1; i >= 0; i--) {
                digit2[i + 1] = digits[i];
            }
            digit2[0] = 1;
            return digit2;
        }

        return digits;
    }

    public static void main(String[] args) {
        LeetCode066 leet = new LeetCode066();
        int[] arr = new int[]{9, 9, 6, 9};
        arr = leet.plusOne(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
