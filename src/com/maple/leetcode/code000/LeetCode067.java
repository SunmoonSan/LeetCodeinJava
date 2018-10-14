package com.maple.leetcode.code000;
/*
给定两个二进制字符串，返回他们的和（用二进制表示）。
输入为非空字符串且只包含数字 1 和 0。

示例 1:
输入: a = "11", b = "1"
输出: "100"

示例 2:
输入: a = "1010", b = "1011"
输出: "10101"
*/

public class LeetCode067 {
    public String addBinary(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();

        int len;
        if (len1 >= len2) {
            len = len1;
            for (int i = 0; i < len - len2; i++) {
                b = "0".concat(b);
            }
        } else {
            len = len2;
            for (int i = 0; i < len - len1; i++) {
                a = "0".concat(a);
            }
        }

        boolean flag = false;
        char[] bin1 = a.toCharArray();
        char[] bin2 = b.toCharArray();

        StringBuilder bins = new StringBuilder();

        StringBuilder res = new StringBuilder();
        for (int i = len - 1; i >= 0; i--) {
            int s;
            if (flag) {
                s = Integer.valueOf(bin1[i] + "") + Integer.valueOf(bin2[i] + "") + 1;

            } else {
                s = Integer.valueOf(bin1[i] + "") + Integer.valueOf(bin2[i] + "");
            }

            if (s >= 2) {
                s = s-2;
                bins.insert(0, s);
                flag = true;
            } else {
                bins.insert(0, s);
                flag = false;
            }
        }

        if (flag) {
            bins.insert(0,1);
        }

        return bins.toString();
    }

    public static void main(String[] args) {
        LeetCode067 leet = new LeetCode067();
        String s = leet.addBinary("1111", "1111");
        System.out.println(s);
    }
}
