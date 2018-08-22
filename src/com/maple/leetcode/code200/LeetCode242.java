package com.maple.leetcode.code200;
/*
给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。
示例 1:
输入: s = "anagram", t = "nagaram"
输出: true
示例 2:
输入: s = "rat", t = "car"
输出: false
说明:
你可以假设字符串只包含小写字母。
进阶:
如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
*/

import java.util.Arrays;

public class LeetCode242 {
    public boolean isAnagram(String s, String t) {

        // 统计字符串s中每个字符的个数
        int[] dict1 = new int[26];
        for (int i = 0; i < s.length(); i++) {
            dict1[s.charAt(i) - 'a']++;
        }

        // 统计字符串t中每个字符的个数
        int[] dict2 = new int[26];
        for (int i = 0; i < t.length(); i++) {
            dict2[t.charAt(i) - 'a']++;
        }

        return Arrays.equals(dict1, dict2);

    }

    public static void main(String[] args) {
        LeetCode242 leet = new LeetCode242();
        String s = "anagram";
        String t = "nagaram";
        boolean b = leet.isAnagram(s, t);
        System.out.println(b);
    }
}
