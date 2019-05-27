package com.maple.leetcode.code400;

/*
计算给定二叉树的所有左叶子之和。

示例：

    3
   / \
  9  20
    /  \
   15   7

在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24
 */

public class LeetCode404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left != null && root.left.left == null && root.left.right == null) {
            return root.left.val + sumOfLeftLeaves(root.right);
        } else {
            return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        }
    }

    public static void main(String[] args) {
        LeetCode404 leet = new LeetCode404();
        Integer[] arr = {3, 9, 20, 8, 7, 15, 7};
        BinaryTree bt = new BinaryTree(arr);
        System.out.println(bt);
        int s = leet.sumOfLeftLeaves(bt.root);
        System.out.println(s);
    }
}
