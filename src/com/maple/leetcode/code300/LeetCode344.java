package com.maple.leetcode.code300;
/*
编写一个函数，其作用是将输入的字符串反转过来。
示例 1:
输入: "hello"
输出: "olleh"

示例 2:
输入: "A man, a plan, a canal: Panama"
输出: "amanaP :lanac a ,nalp a ,nam A"
*/

public class LeetCode344 {

    public void reverseString(char[] s) {
        int len = s.length;
        for (int i = 0; i < len / 2; i++) {
            char t = s[i];
            s[i] = s[len - i - 1];
            s[len - i - 1] = t;
        }
    }

    public static void main(String[] args) {
        LeetCode344 leet = new LeetCode344();
        char[] cs = {'h', 'e', 'l', 'l', 'o'};
        leet.reverseString(cs);
    }
}
