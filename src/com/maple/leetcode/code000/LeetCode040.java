package com.maple.leetcode.code000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class LeetCode040 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(candidates);
        Stack<Integer> stack = new Stack<>();

        combinationSum2(lists, candidates, 0, stack, target);
        return lists;
    }

    private void combinationSum2(List<List<Integer>> lists, int[] candidates, int index, Stack<Integer> stack, int target) {
        if (target < 0) {
            return;
        } else if (target == 0) {
            System.out.println(stack);
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            stack.push(candidates[i]);
            combinationSum2(lists, candidates, i + 1, stack, target - candidates[i]);
            stack.pop();
        }
    }

    public static void main(String[] args) {
        LeetCode040 leet = new LeetCode040();
//        int[] cans = {10,1,2,7,6,1,5};
        int[] cans = {1, 2, 2, 2, 5};
//        int target = 8;
        int target = 5;
        leet.combinationSum2(cans, target);
    }
}
