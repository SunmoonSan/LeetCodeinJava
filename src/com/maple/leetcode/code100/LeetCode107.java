package com.maple.leetcode.code100;
/*
给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
例如：
给定二叉树 [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
返回其自底向上的层次遍历为：
[
  [15,7],
  [9,20],
  [3]
]
 */

import java.util.*;

public class LeetCode107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        Stack<List<Integer>> stack = new Stack<>();
        if (root == null) {
            return lists;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<TreeNode> treeNodes = new ArrayList<>();
            while (!queue.isEmpty()) {
                treeNodes.add(queue.remove());
            }

            List<Integer> integers = new ArrayList<>();
            for (TreeNode tree : treeNodes) {
                integers.add(tree.val);

                if (tree.left != null) {
                    queue.add(tree.left);
                }

                if (tree.right != null) {
                    queue.add(tree.right);
                }

            }

            stack.push(integers);
        }

        while (!stack.isEmpty()) {
            lists.add(stack.pop());
        }

        return lists;
    }
}
