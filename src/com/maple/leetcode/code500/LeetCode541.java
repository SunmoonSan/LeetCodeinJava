package com.maple.leetcode.code500;

import java.util.Stack;

public class LeetCode541 {
    public String reverseStr(String s, int k) {

        Stack<Character> stack = new Stack<>();
        char[] chs = s.toCharArray();
        char[] str = new char[s.length()];

        /*if (s.length()<k) {
            for (int i=0; i<k; i++) {
                stack.push(chs[i]);
            }
            int j=0;
            for (int i=0; i<k; i++) {
                str[j++] = stack.pop();
            }

        }*/



        for (int i=0; i<chs.length; i=i+k) {
            for (int j=i; j<i+k; j++) {
                stack.push(chs[j]);
            }
        }

        int i=0;
        while (!stack.isEmpty()) {
            str[i++] = stack.pop();
        }
        return String.valueOf(str);
    }

    public static void main(String[] args) {
        LeetCode541 leet = new LeetCode541();
        String s = leet.reverseStr("abcdefgh", 3);
        System.out.println(s);
    }
}
