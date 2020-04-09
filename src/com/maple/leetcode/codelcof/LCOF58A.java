package com.maple.leetcode.codelcof;

import java.util.Stack;

public class LCOF58A {

    public static void main(String[] args) {
        String s = "  hello world!  ";
        LCOF58A lcof = new LCOF58A();
        lcof.reverseWords(s);
    }

    public String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        char[] cs = s.toCharArray();
        int i = 0;
        while (i < cs.length) {
            int j = i;
            StringBuilder word = new StringBuilder();
            while (j < cs.length && cs[j] != ' ') {
                word.append(cs[j]);
                j++;
            }
            if (word.length() > 0) {
                stack.push(word.toString());
            }
            i = j + 1;
        }

        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()) {
            res.append(stack.pop());
            if (!stack.isEmpty()) {
                res.append(" ");
            }
        }

        return res.toString();
    }
}
