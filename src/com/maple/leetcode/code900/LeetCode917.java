package com.maple.leetcode.code900;
/*
给定一个字符串 S，返回 “反转后的” 字符串，其中不是字母的字符都保留在原地，而所有字母的位置发生反转。

示例 1：
输入："ab-cd"
输出："dc-ba"

示例 2：
输入："a-bC-dEf-ghIj"
输出："j-Ih-gfE-dCba"

示例 3：
输入："Test1ng-Leet=code-Q!"
输出："Qedo1ct-eeLg=ntse-T!"

提示：
S.length <= 100
33 <= S[i].ASCIIcode <= 122
S 中不包含 \ or "
*/

public class LeetCode917 {
    public String reverseOnlyLetters(String S) {
        int l = 0; // 左索引
        int r = S.length() - 1; // 右索引
        char[] cs = S.toCharArray();

        while (l < r) {
            if (!Character.isLetter(cs[l])) { // 左边不是字母, 左索引右移
                l++;
            } else if (!Character.isLetter(cs[r])) { // 右边不是字母, 右索引左移
                r--;
            } else { // 左,右都是字母, 交付左右索引处的数
                char c = cs[l];
                cs[l] = cs[r];
                cs[r] = c;

                // 左右索引处的数交换后, 左索引右移, 右索引左移
                l++;
                r--;
            }
        }

        return new String(cs);
    }

    public static void main(String[] args) {
        LeetCode917 leet = new LeetCode917();
        String s = "7_28]";
        s = leet.reverseOnlyLetters(s);
        System.out.println(s);
    }
}
