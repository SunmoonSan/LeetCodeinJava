package com.maple.leetcode.code100;
/*
 * @desc : Created by San on 2019-05-01 08:39
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode129 {
    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return  0;
        }

        List<Integer> lists = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();
        sumNumbers(root, stack, lists);

        int sum = 0;
        for (int n : lists) {
            sum += n;
        }
        return sum;
    }

    private void sumNumbers(TreeNode root, Stack<TreeNode> stack, List<Integer> lists) {
        if (root.left == null && root.right == null) {
            stack.add(root);
            int sum = 0;
            List<TreeNode> treeNodes = new ArrayList<>(stack);
            int n = 1;
            for (int i = treeNodes.size() - 1; i >= 0; i--) {
                sum = sum + treeNodes.get(i).val * n;
                n = n * 10;
            }

            lists.add(sum);

            stack.pop();
            return;
        }

        stack.push(root);
        if (root.left != null) {
            sumNumbers(root.left, stack, lists);
        }

        if (root.right != null) {
            sumNumbers(root.right, stack, lists);
        }
        stack.pop();
    }

    public static void main(String[] args) {
        LeetCode129 leet = new LeetCode129();
        Integer[] array = {4, 9, 0, 5, 1};
        BinaryTree bt = new BinaryTree(array);
        leet.sumNumbers(bt.root);
    }
}
