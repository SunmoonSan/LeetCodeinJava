package com.maple.leetcode.codeA00;

import java.util.Stack;

public class LeetCode1047 {
    public static void main(String[] args) {
        LeetCode1047 leet = new LeetCode1047();
        String s = "abbaca";
        String t = leet.removeDuplicates(s);
        System.out.println(t);
    }

    public String removeDuplicates(String S) {
        char[] cs = S.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < cs.length; i++) {
            if (stack.isEmpty()) {
                stack.push(cs[i]);
            } else {
                if (stack.peek() == cs[i]) {
                    stack.pop();
                } else {
                    stack.push(cs[i]);
                }
            }
        }
        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }
        return res.reverse().toString();
    }
}

