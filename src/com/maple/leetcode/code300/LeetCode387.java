package com.maple.leetcode.code300;
/*
给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
案例:
s = "leetcode"
返回 0.
s = "loveleetcode",
返回 2.
注意事项：您可以假定该字符串只包含小写字母。
*/

public class LeetCode387 {
    public int firstUniqChar(String s) {
        char[] chars = new char[26];  // 为每个字符设置索引
        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (chars[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LeetCode387 leet = new LeetCode387();
        int index = leet.firstUniqChar("eetcode");
        System.out.println(index);
    }
}
