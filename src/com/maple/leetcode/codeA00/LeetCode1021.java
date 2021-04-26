package com.maple.leetcode.codeA00;

import java.util.*;

public class LeetCode1021 {
    public static void main(String[] args) {
        LeetCode1021 leet = new LeetCode1021();
        String s = "(()())(())(()(()))";
        String t = leet.removeOuterParentheses(s);
        System.out.println(t);
    }

    public String removeOuterParentheses(String S) {
        char[] cs = S.toCharArray();
        StringBuilder res = new StringBuilder();
        Set<Integer> indexs = new HashSet<>();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < cs.length; i++) {
            if (stack.isEmpty()) {
                stack.push(cs[i]);
                indexs.add(i);
            } else if ((stack.peek() == '(' && cs[i] == ')')) {
                stack.pop();
            } else {
                stack.push(cs[i]);
            }
            if (stack.isEmpty()) {
                indexs.add(i);
            }
        }
        for (int i = 0; i < cs.length; i++) {
            if (!indexs.contains(i)) {
                res.append(cs[i]);
            }
        }
        return res.toString();
    }
}
