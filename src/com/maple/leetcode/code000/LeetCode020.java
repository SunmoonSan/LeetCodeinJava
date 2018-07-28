package com.maple.leetcode.code000;

import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 有效字符串需满足：
 左括号必须用相同类型的右括号闭合。
 左括号必须以正确的顺序闭合。
 注意空字符串可被认为是有效字符串。
 示例 1:
 输入: "()"
 输出: true

 示例 2:
 输入: "()[]{}"
 输出: true

 示例 3:
 输入: "(]"
 输出: false

 示例 4:
 输入: "([)]"
 输出: false

 示例 5:
 输入: "{[]}"
 输出: true

 */

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
