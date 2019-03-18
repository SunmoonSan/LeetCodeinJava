package com.maple.leetcode.code800;
/*
给定一个字符串 S 和一个字符 C。返回一个代表字符串 S 中每个字符到字符串 S 中的字符 C 的最短距离的数组。

示例 1:
输入: S = "loveleetcode", C = 'e'
输出: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
说明:
字符串 S 的长度范围为 [1, 10000]。
C 是一个单字符，且保证是字符串 S 里的字符。
S 和 C 中的所有字母均为小写字母。
 */

import java.util.ArrayList;
import java.util.List;

public class LeetCode821 {
    public int[] shortestToChar(String S, char C) {
        int[] lens = new int[S.length()];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == C) {
                list.add(i);
            }
        }

        int i = 0;
        int j = 0;
        while (j < S.length()) {
            if (i < list.size()) {
                if (j == list.get(i)) {
                    lens[j] = 0;
                    i++;
                } else if (j < list.get(0)) {
                    lens[j] = list.get(0) - j;
                } else if (j > list.get(i - 1) && j < list.get(i)) {
                    lens[j] = Math.min(j - list.get(i - 1), list.get(i) - j);
                }
                j++;
            }

            if (j < S.length() && j > list.get(list.size() - 1)) {
                lens[j] = j - list.get(list.size() - 1);
                j++;
            }
        }

        return lens;
    }

    public static void main(String[] args) {
        LeetCode821 leet = new LeetCode821();
        String S = "loveleetcode";
        char C = 'e';
        leet.shortestToChar(S, C);
    }
}
