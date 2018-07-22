package com.maple.leetcode;

import java.util.Stack;

public class LeetCode020 {
    public boolean isValid(String s) {
        if ("".equals(s)) {
            return true;
        }

        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        stack.push(chars[0]);
        for (int i=1; i<chars.length; i++) {
            if (stack.isEmpty()) {
                stack.push(chars[i]);
            } else {
                if (!isTwice(stack.peek(), chars[i])) {
                    stack.push(chars[i]);
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

    // 判断两字符是否匹配
    private boolean isTwice(char ch1, char ch2) {
        if (ch1=='(' && ch2==')') {
            return true;
        } else if (ch1=='[' && ch2==']') {
            return true;
        }
        return ch1 == '{' && ch2 == '}';
    }

    public static void main(String[] args) {
        LeetCode020 leet = new LeetCode020();
        System.out.println(leet.isValid(""));
    }
}
