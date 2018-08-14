package com.maple.leetcode.code500;
/*
给定一个单词，你需要判断单词的大写使用是否正确。
我们定义，在以下情况时，单词的大写用法是正确的：
    全部字母都是大写，比如"USA"。
    单词中所有字母都不是大写，比如"leetcode"。
    如果单词不只含有一个字母，只有首字母大写， 比如 "Google"。
否则，我们定义这个单词没有正确使用大写字母。

示例 1:
输入: "USA"
输出: True

示例 2:
输入: "FlaG"
输出: False

注意: 输入是由大写和小写拉丁字母组成的非空单词。
*/

public class LeetCode520 {
    public boolean detectCapitalUse(String word) {
        if (isUpperCase(word.charAt(0))) { // 第1个字符为大写
            int countUpper = 0; // 第2个到最后一个共计大写字母
            int countLower = 0; // 第2个到最后一个共计小写字母

            for (int i = 1; i < word.length(); i++) {
                if (isUpperCase(word.charAt(i))) {
                    countUpper++;
                } else {
                    countLower++;
                }
            }

            // 全为大写或者全为小写
            if (countLower == word.length() - 1 || countUpper == word.length() - 1) {
                return true;
            } else {
                return false;
            }
        } else { // 第1个字符为小写
            for (int i = 1; i < word.length(); i++) {
                if (isUpperCase(word.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    }

    /*
    判断一个字符是大写字母
     */
    public boolean isUpperCase(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            return true;
        }
        return false;
    }

    /*
    判断一个字符是小写字母
     */
    public boolean isLowerCase(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        LeetCode520 leet = new LeetCode520();
        boolean b = leet.detectCapitalUse("FlaG");
        System.out.println(b);
    }
}
