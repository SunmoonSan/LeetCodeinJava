package com.maple.leetcode.codeC00;
/*
 * @desc : Created by San on 2019-11-20 16:08
 */

import java.util.Stack;

public class LeetCode1221 {
    public int balancedStringSplit(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
            } else {
                if (stack.peek() == c) {
                    stack.push(c);
                } else {
                    stack.pop();
                }
            }

            if (stack.isEmpty()) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        LeetCode1221 leet = new LeetCode1221();
        String s = "RLLLLRRRLR";
        int n = leet.balancedStringSplit(s);
        System.out.println(n);
    }
}


