package com.maple.leetcode.codeG00;

import java.util.Stack;

public class LeetCode1614 {
    public static void main(String[] args) {
        LeetCode1614 leet = new LeetCode1614();
        String s = "1";
        leet.maxDepth(s);
    }

    public int maxDepth(String s) {
        int deepest = 0;
        Stack<Character> stack = new Stack<>();
        char[] cs = s.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            if (cs[i] == '(') {
                stack.push(cs[i]);
                if (deepest < stack.size()) {
                    deepest = stack.size();
                }
            }

            if (cs[i] == ')') {
                stack.pop();
            }
        }

        return deepest;
    }
}

