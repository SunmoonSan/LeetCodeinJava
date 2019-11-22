package com.maple.leetcode.code800;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode842 {
    public List<Integer> splitIntoFibonacci(String S) {
        List<Integer> list = new ArrayList<>();
        Stack<String> stack = new Stack<>();
//        splitIntoFibonacci(list, S, 0, "", stack);
        return list;
    }

    private void splitIntoFibonacci(List<Integer> list, String s, int index, String res, Stack<Integer> stack) {
        for (int i = index; i < s.length(); i++) {
            int n = Integer.valueOf(res+s.charAt(i));
            stack.push(n);
        }
    }
}
