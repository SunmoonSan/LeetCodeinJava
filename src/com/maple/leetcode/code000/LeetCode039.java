package com.maple.leetcode.code000;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode039 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        combinationSum(lists, candidates, 0, stack, target);
        return lists;
    }

    private void combinationSum(List<List<Integer>> lists, int[] candidates, int index, Stack<Integer> stack, int target) {
        if (target < 0) {
            return;
        } else if (target == 0) {
            lists.add(new ArrayList<>(stack));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            stack.push(candidates[i]);
            combinationSum(lists, candidates, i, stack, target - candidates[i]);
            stack.pop();
        }
    }

    public static void main(String[] args) {
        LeetCode039 leet = new LeetCode039();
        int[] cans = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> lists = leet.combinationSum(cans, target);
        System.out.println(lists);
    }
}
