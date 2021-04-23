package com.maple.leetcode.codeH00;

public class LeetCode1768 {
    public static void main(String[] args) {
        LeetCode1768 leet = new LeetCode1768();
        String a = "abc";
        String b = "pq";
        leet.mergeAlternately(a, b);
    }

    public String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();
        int len = Math.min(word1.length(), word2.length());
        System.out.println(len);
        for (int i = 0; i < len; i++) {
            res.append(word1.charAt(i)).append(word2.charAt(i));
        }
        if (word1.length() < word2.length()) {
            for (int i = len; i < word2.length(); i++) {
                res.append(word2.charAt(i));
            }
        } else if (word1.length() > word2.length()) {
            for (int i = len; i < word1.length(); i++) {
                res.append(word1.charAt(i));
            }
        }

        return res.toString();
    }
}
