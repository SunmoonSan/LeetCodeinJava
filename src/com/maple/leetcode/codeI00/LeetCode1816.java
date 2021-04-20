package com.maple.leetcode.codeI00;

public class LeetCode1816 {
    public static void main(String[] args) {
        LeetCode1816 leet = new LeetCode1816();
        String s = "What is the solution to this problem";
        int k = 4;
        String a = leet.truncateSentence(s, k);
        System.out.println(a);
    }

    public String truncateSentence(String s, int k) {
        StringBuilder res = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
            if (count == k) {
                return res.toString();
            } else {
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}
