package com.maple.leetcode.code500;
/*
给定一个整数，将其转化为7进制，并以字符串形式输出。
示例 1:
输入: 100
输出: "202"
示例 2:
输入: -7
输出: "-10"
注意: 输入范围是 [-1e7, 1e7] 。
*/

public class LeetCode504 {
    public String convertToBase7(int num) {
        String sign = "";
        if (num < 0) {
            sign = "-";
            num = -num;
        }
        String[] arr = new String[10];

        int count = 0;
        int r = 0; // 求余结果
        while (num >= 7) {
            r = num % 7;
            arr[count] = String.valueOf(r);
            count++;
            num = (num - r) / 7;
        }

        arr[count] = String.valueOf(num);

        StringBuilder res = new StringBuilder();
        res.append(sign);
        while (count >= 0) {
            res.append(arr[count]);
            count--;
        }
//        System.out.println(res.toString());
        return res.toString();
    }

    public static void main(String[] args) {
        LeetCode504 leet = new LeetCode504();
        leet.convertToBase7(2342343);
    }
}
