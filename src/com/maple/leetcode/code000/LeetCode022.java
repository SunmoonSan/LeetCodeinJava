package com.maple.leetcode.code000;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode022 {

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        String s = "(";
        generateParenthesis(list, n, 1, s);

        return list;
    }

    private void generateParenthesis(List<String> list, int n, int index, String s) {
        if (index == n * 2 - 1) {
            s += ")";
            int count = 0;
            for (char c : s.toCharArray()) {
                if (c == '(') {
                    count++;
                }
            }
            if (count == n) {
                Stack<Character> stack = new Stack<>();
                for (char c : s.toCharArray()) {
                    if (!stack.isEmpty()) {
                        if (stack.peek() == '(' && c == ')') {
                            stack.pop();
                        } else {
                            stack.push(c);
                        }
                    } else {
                        stack.push(c);
                    }
                }
                if (stack.isEmpty()) {
//                    System.out.println(s);
                    list.add(s);
                }
            }
            return;
        }
        generateParenthesis(list, n, index + 1, s + "(");
        generateParenthesis(list, n, index + 1, s + ")");
    }

    public static void main(String[] args) {
        LeetCode022 leet = new LeetCode022();
        leet.generateParenthesis(3);
    }
}
