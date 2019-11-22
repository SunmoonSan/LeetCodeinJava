package com.maple.leetcode.code300;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode377 {
    public int combinationSum4(int[] nums, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        combinationSum4(lists, nums, 0, stack, target);
        return lists.size();
    }

    private void combinationSum4(List<List<Integer>> lists, int[] nums, int index, Stack<Integer> stack, int target) {
        if (target < 0) {
            return;
        } else if (target == 0) {
            System.out.println(stack);
            lists.add(new ArrayList<>(stack));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            stack.push(nums[i]);
            combinationSum4(lists, nums, i, stack, target - nums[i]);
            stack.pop();
        }
    }

    public static void main(String[] args) {
        LeetCode377 leet = new LeetCode377();
        int[] nums = {4, 2, 1};
        int target = 32;
        int n = leet.combinationSum4(nums, target);
        System.out.println(n);
    }
}
