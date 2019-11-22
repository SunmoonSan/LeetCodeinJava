package com.maple.leetcode.code200;
/*
找出所有相加之和为 n 的 k 个数的组合。组合中只允许含有 1 - 9 的正整数，并且每种组合中不存在重复的数字。
说明：
所有数字都是正整数。
解集不能包含重复的组合。

示例 1:
输入: k = 3, n = 7
输出: [[1,2,4]]

示例 2:
输入: k = 3, n = 9
输出: [[1,2,6], [1,3,5], [2,3,4]]
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode216 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> lists = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        combinationSum3(lists, k, 1, stack, n);
        return lists;
    }

    private void combinationSum3(List<List<Integer>> lists, int k, int index, Stack<Integer> stack, int sum) {

        if (sum < 0) {
            return;
        } else if (sum == 0 && stack.size() == k) {
            lists.add(new ArrayList<>(stack));
            return;
        }
        for (int i = index; i <= 9; i++) {
            stack.push(i);
            combinationSum3(lists, k, i + 1, stack, sum - i);
            stack.pop();
        }
    }

    public static void main(String[] args) {
        LeetCode216 leet = new LeetCode216();
        List<List<Integer>> lists = leet.combinationSum3(3, 9);
        System.out.println(lists);
    }
}
