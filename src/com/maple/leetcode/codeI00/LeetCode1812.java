package com.maple.leetcode.codeI00;

public class LeetCode1812 {
    public static void main(String[] args) {
        LeetCode1812 leet = new LeetCode1812();
        String s = "h3";
        boolean b = leet.squareIsWhite(s);
        System.out.println(b);
    }

    public boolean squareIsWhite(String coordinates) {
        boolean[] flags = {false, true, false, true, false, true, false, true};
        int i = coordinates.charAt(0) - 'a';
        int n = coordinates.charAt(1) - 48;
        if (n % 2 == 1) {
            return flags[i];
        }
        return !flags[i];
    }
}
