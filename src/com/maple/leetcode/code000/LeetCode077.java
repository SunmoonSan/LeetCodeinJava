package com.maple.leetcode.code000;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode077 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> lists = new ArrayList<>();
        String s = "";
        Stack<Integer> stack = new Stack<>();
        combine(lists, 1, n, k, stack);
        return lists;
    }

    private void combine(List<List<Integer>> lists, int start, int stop, int k, Stack<Integer> stack) {

        if (stack.size() == k) {
            System.out.println(stack);
            lists.add(new ArrayList<>(stack));
            return;
        }

        for (int i = start; i <= stop; i++) {
            stack.push(i);
            combine(lists, i + 1, stop, k, stack);
            stack.pop();
        }

    }

    public static void main(String[] args) {
        LeetCode077 leet = new LeetCode077();
        List<List<Integer>> lists = leet.combine(3, 3);
        System.out.println(lists);
    }
}
