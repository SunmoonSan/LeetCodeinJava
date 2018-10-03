package com.maple.leetcode.code000;
/*
编写一个函数来查找字符串数组中的最长公共前缀。
如果不存在公共前缀，返回空字符串 ""。

示例 1:
输入: ["flower","flow","flight"]
输出: "fl"

示例 2:
输入: ["dog","racecar","car"]
输出: ""
解释: 输入不存在公共前缀。

说明:
所有输入只包含小写字母 a-z 。
*/
public class LeetCode014 {
    public String longestCommonPrefix(String[] strs) {

        // 排除[]的情况
        if (strs.length == 0) {
            return "";
        }

        // 计算出strs中元素的最小长度
        int min = strs[0].length();
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < min) {
                min = strs[i].length();
            }
        }

        // 排除strs中有空元素的情况, 如 {"", "egd"}
        if (min == 0) {
            return "";
        }

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < min; i++) {
            char ch = strs[0].charAt(i); // ch记录第１个元素的第１个字符
            // ch依次从第2个元素比较,如果存在不匹配的情况，则返回结束
            for (int j = 1; j < strs.length; j++) {
                if (ch != strs[j].charAt(i)) {
                    return res.toString();
                }
            }
            res.append(ch); // 所有元素的第i个字符匹配，记录之．
        }

        return res.toString();
    }

    public static void main(String[] args) {
        LeetCode014 leet = new LeetCode014();
        String[] strings = {"flower", "flow", "flight"};
//        String[] strings = {"","b"};
        String s = leet.longestCommonPrefix(strings);
        System.out.println(s);
    }
}
