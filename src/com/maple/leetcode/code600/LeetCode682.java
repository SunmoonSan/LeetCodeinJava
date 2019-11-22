package com.maple.leetcode.code600;

import java.util.Stack;

public class LeetCode682 {
    public int calPoints(String[] ops) {
        Stack<String> stack = new Stack<String>();

        for (String s : ops) {
            if ("C".equals(s)) {
                stack.pop();
            } else if ("D".equals(s)) {
                String top = stack.peek();
                stack.push(Integer.valueOf(top) * 2 + "");
            } else if ("+".equals(s)) {
                String a = stack.pop();
                String b = stack.pop();
                stack.push(b);
                stack.push(a);
                stack.push(Integer.valueOf(a) + Integer.valueOf(b) + "");
            } else {
                stack.push(s);
            }
        }

        int sum = 0;
        while (!stack.isEmpty()) {
            sum += Integer.valueOf(stack.pop());
        }
        return sum;
    }

    public static void main(String[] args) {
        LeetCode682 leet = new LeetCode682();
        String[] s = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        leet.calPoints(s);
    }
}
