package com.maple.leetcode.code100;
/*
给定一个字符串，逐个翻转字符串中的每个单词。
示例 1：
输入: "the sky is blue"
输出: "blue is sky the"

示例 2：
输入: "  hello world!  "
输出: "world! hello"
解释: 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。

示例 3：
输入: "a good   example"
输出: "example good a"
解释: 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
 
说明：
无空格字符构成一个单词。
输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
 
进阶：
请选用 C 语言的用户尝试使用 O(1) 额外空间复杂度的原地解法。
 */

import java.util.ArrayList;
import java.util.List;

public class LeetCode151 {
    public String reverseWords(String s) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            StringBuilder res = new StringBuilder();
            int j = i;
            while (j < s.length() && s.charAt(j) != ' ') {
                res.append(s.charAt(j));
                j++;
            }
            if (res.length() > 0) {
                list.add(res.toString());
            }
            i = j;
        }

        StringBuilder builder = new StringBuilder();
        for (int i = list.size() - 1; i >= 0; i--) {
            builder.append(list.get(i));
            if (i > 0) {
                builder.append(" ");
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        LeetCode151 leet = new LeetCode151();
        String s = "  hello world!  ";
        String t = leet.reverseWords(s);
        System.out.println(t);
    }
}
