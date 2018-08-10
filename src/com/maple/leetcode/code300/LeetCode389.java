package com.maple.leetcode.code300;
/*
给定两个字符串 s 和 t，它们只包含小写字母。
字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
请找出在 t 中被添加的字母。
示例:
输入：
s = "abcd"
t = "abcde"
输出：
e
解释：
'e' 是那个被添加的字母。
*/

public class LeetCode389 {
    public char findTheDifference(String s, String t) {
        int[] dict = new int[26];  // 构造一个字典

        for (int i = 0; i < t.length(); i++) {
            dict[t.charAt(i) - 'a']++;
        }

        // 逐个遍历字符,字典的值一次-1, 最后字典为1的即为添加的字母
        for (int i = 0; i < s.length(); i++) {
            dict[s.charAt(i) - 'a']--;
        }

        char ch = ' ';
        for (int i = 0; i < dict.length; i++) {
            if (dict[i] == 1) {
                ch = (char) ('a' + i);
            }
        }
        return ch;
    }

    public static void main(String[] args) {
        String s = "a";
        String t = "aa";
        LeetCode389 leet = new LeetCode389();
        char ch = leet.findTheDifference(s, t);
        System.out.println(ch);
    }
}
