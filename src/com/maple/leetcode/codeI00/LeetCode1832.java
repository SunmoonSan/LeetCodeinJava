package com.maple.leetcode.codeI00;

public class LeetCode1832 {
    public static void main(String[] args) {
        LeetCode1832 leet = new LeetCode1832();
        String s = "thequickbrownfoxjumpsoverthelazydog";
        leet.checkIfPangram(s);
    }

    public boolean checkIfPangram(String sentence) {
        int[] abcs = new int[26];
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            abcs[c - 'a'] = 1;
        }

        for (int i = 0; i < abcs.length; i++) {
            if (abcs[i] == 0) {
                return false;
            }
        }
        return true;
    }
}
