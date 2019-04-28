package com.maple.leetcode.code000;
/*
给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

示例 1:
输入: "abcabcbb"
输出: 3
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。

示例 2:
输入: "bbbbb"
输出: 1
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。

示例 3:
输入: "pwwkew"
输出: 3
解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */

import java.util.HashMap;
import java.util.Map;

public class LeetCode003 {
    public int lengthOfLongestSubstring(String s) {
        char[] cs = s.toCharArray();
        int max = 0;
        int i = -1;
        Map<Character, Integer> kvs = new HashMap<>();
        for (int j = 0; j < cs.length; j++) {
            if (kvs.containsKey(cs[j])) {
                i = Math.max(kvs.get(cs[j]), i);
            }

            kvs.put(cs[j], j);
            max = Math.max(max, j - i);
        }

        return max;
    }

    public static void main(String[] args) {
        LeetCode003 leet = new LeetCode003();
        String s = "bbbbb";
        int min = leet.lengthOfLongestSubstring(s);
        System.out.println(min);
    }
}
