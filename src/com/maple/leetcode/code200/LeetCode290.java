package com.maple.leetcode.code200;
/*
给定一种 pattern(模式) 和一个字符串 str ，判断 str 是否遵循相同的模式。
这里的遵循指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应模式。

示例1:
输入: pattern = "abba", str = "dog cat cat dog"
输出: true

示例 2:
输入:pattern = "abba", str = "dog cat cat fish"
输出: false

示例 3:
输入: pattern = "aaaa", str = "dog cat cat dog"
输出: false

示例 4:
输入: pattern = "abba", str = "dog dog dog dog"
输出: false
说明:
你可以假设 pattern 只包含小写字母， str 包含了由单个空格分隔的小写字母。

在真实的面试中遇到过这道题？
 */

import java.util.*;

public class LeetCode290 {
    public boolean wordPattern(String pattern, String str) {
        List<String> words = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            int j = i;
            StringBuilder res = new StringBuilder();
            while (j < str.length() && str.charAt(j) != ' ') {
                res.append(str.charAt(j));
                j++;
            }
            words.add(res.toString());
            i = j;
        }

        if (pattern.length() != words.size()) {
            return false;
        }

        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (map.containsKey(c)) {
                if (!map.get(c).equals(words.get(i))) {
                    return false;
                }
            } else {
                map.put(c, words.get(i));
            }
        }

        Set<String> set = new HashSet<>(map.values());

        if (set.size() != map.keySet().size()) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        LeetCode290 leet = new LeetCode290();
        String pattern = "jquery";
        String str = "jquery";
        boolean b = leet.wordPattern(pattern, str);
        System.out.println(b);
    }
}
