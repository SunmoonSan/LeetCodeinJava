package com.maple.leetcode.code000;

import java.util.Stack;

/**
 * @author San
 * @time 2022/1/16 15:32:21
 * @desc
 */
public class LeetCode032 {
    public static void main(String[] args) {
        LeetCode032 leet = new LeetCode032();
        String s = ")()())";
        int len = leet.longestValidParentheses(s);
        System.out.println(len);
    }

    public int longestValidParentheses(String s) {
        int max = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    max = Math.max(max, i - stack.peek());
                }
            }
        }
        return max;
    }
}
