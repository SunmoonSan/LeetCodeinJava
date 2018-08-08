package com.maple.leetcode.code300;
/*
编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
示例 1：
给定 s = "hello", 返回 "holle".
示例 2：
给定 s = "leetcode", 返回 "leotcede".
注意:
元音字母不包括 "y".
 */

import java.util.Stack;

public class LeetCode345 {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < chars.length; i++) {
            if (isVowel(chars[i])) {
                stack.push(chars[i]);
            }
        }

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (isVowel(chars[i])) {
                chars[i] = stack.pop();
            }
            res.append(chars[i]);
        }

        return res.toString();
    }

    // 判断一个字符是否为元音
    private boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'A') {
            return true;
        } else if (ch == 'e' || ch == 'E') {
            return true;
        } else if (ch == 'i' || ch == 'I') {
            return true;
        } else if (ch == 'o' || ch == 'O') {
            return true;
        } else if (ch == 'u' || ch == 'U') {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        LeetCode345 leet = new LeetCode345();
        String s = leet.reverseVowels("aA");
        System.out.println(s);
    }
}
