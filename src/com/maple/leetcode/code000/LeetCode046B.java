package com.maple.leetcode.code000;
/*
 * @desc : Created by San on 2019-05-02 08:41
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode046B {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        Stack<Integer> stack = new Stack<>();
        permute(nums, 0, stack, used, lists);

        return lists;
    }

    private void permute(int[] nums, int index, Stack<Integer> stack, boolean[] used, List<List<Integer>> lists) {
        if (index == nums.length) {
            lists.add(new ArrayList<>(stack));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                stack.push(nums[i]);
                used[i] = true;
                permute(nums, index + 1, stack, used, lists);
                stack.pop();
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        LeetCode046B leet = new LeetCode046B();
        int[] nums = {1, 2, 3};
        leet.permute(nums);
    }
}
