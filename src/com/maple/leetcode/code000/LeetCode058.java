package com.maple.leetcode.code000;
/*
 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 如果不存在最后一个单词，请返回 0 。

 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 示例:
 输入: "Hello World"
 输出: 5
*/

public class LeetCode058 {
    public int lengthOfLastWord(String s) {

        int count = 0; // 统计最后一个单词的字符数
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                continue;
            }

            // i>count 放前面, 否则 "a" 这样的字符串会越界
            while (i >= count && s.charAt(i - count) != ' ') {
                count++;
            }

            return count;
        }

        return count;
    }

    public static void main(String[] args) {
        LeetCode058 leet = new LeetCode058();
        int n = leet.lengthOfLastWord("a");
        System.out.println(n);
    }
}
