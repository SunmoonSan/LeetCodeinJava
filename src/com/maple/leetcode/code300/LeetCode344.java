package com.maple.leetcode.code300;

public class LeetCode344 {
    public String reverseString(String s) {
        char[] chs1 = s.toCharArray();

        int len = chs1.length;
        char[] chs2 = new char[len];

        for (int i=chs1.length-1; i>=0; i--) {
            chs2[len-i-1] = chs1[i];
        }
        return String.valueOf(chs2);
    }

    public static void main(String[] args) {
        LeetCode344 leet = new LeetCode344();
        String s = leet.reverseString("hello");
        System.out.println(s);
    }
}
