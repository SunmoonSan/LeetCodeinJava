package com.maple.leetcode.code100;

/*
根据逆波兰表示法，求表达式的值。
有效的运算符包括 +, -, *, / 。每个运算对象可以是整数，也可以是另一个逆波兰表达式。

说明：
    整数除法只保留整数部分。
    给定逆波兰表达式总是有效的。换句话说，表达式总会得出有效数值且不存在除数为 0 的情况。

示例 1：
输入: ["2", "1", "+", "3", "*"]
输出: 9
解释: ((2 + 1) * 3) = 9

示例 2：
输入: ["4", "13", "5", "/", "+"]
输出: 6
解释: (4 + (13 / 5)) = 6

示例 3：
输入: ["10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"]
输出: 22
解释:
  ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
= ((10 * (6 / (12 * -11))) + 17) + 5
= ((10 * (6 / -132)) + 17) + 5
= ((10 * 0) + 17) + 5
= (0 + 17) + 5
= 17 + 5
= 22
 */

import java.util.Stack;

public class LeetCode150 {
    public int evalRPN(String[] tokens) {
        if (tokens.length == 1) {
            return Integer.valueOf(tokens[0]);
        }

        Stack<Integer> stack = new Stack<Integer>();
        int r = 0;
        for (String s : tokens) {
            if ("+".equals(s)) {
                int s2 = stack.pop();
                int s1 = stack.pop();
                r = s1 + s2;
                stack.push(r);
            } else if ("-".equals(s)) {
                int s2 = stack.pop();
                int s1 = stack.pop();
                r = s1 - s2;
                stack.push(r);
            } else if ("*".equals(s)) {
                int s2 = stack.pop();
                int s1 = stack.pop();
                r = s1 * s2;
                stack.push(r);
            } else if ("/".equals(s)) {
                int s2 = stack.pop();
                int s1 = stack.pop();
                r = s1 / s2;
                stack.push(r);
            } else {
                stack.push(Integer.valueOf(s));
            }
        }

        return r;
    }

    public static void main(String[] args) {
        LeetCode150 leet = new LeetCode150();
        String[] tokens = {"10"};
        int s = leet.evalRPN(tokens);
        System.out.println(s);
    }
}
