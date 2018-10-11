package com.maple.leetcode.code000;
/*
实现 strStr() 函数。
给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中
找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。

示例 1:
输入: haystack = "hello", needle = "ll"
输出: 2

示例 2:
输入: haystack = "aaaaa", needle = "bba"
输出: -1

说明:
当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
*/

public class LeetCode028 {

    public int strStr(String haystack, String needle) {
        if ("".equals(needle)) {
            return 0;
        }

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) != needle.charAt(0)) {  // haystack逐个字符与needle第一个字符比较
                continue;
            }

            // 从第一个相同字符开始向后扫描比较
            for (int j = 0; j < needle.length(); j++) {
                if (i + j < haystack.length()) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {  // 如某个字符不相等,则i+1重新来过
                        break;
                    }
                } else {
                    return -1;
                }

                if (j == needle.length() - 1) {  // 比较到needle最后一个字符, 返回haystack的索引
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        String haystack = "mississippi", needle = "pi";
        String haystack = "hello", needle = "ll";
        LeetCode028 leet = new LeetCode028();
        int index = leet.strStr(haystack, needle);
        System.out.println(index);
    }
}
