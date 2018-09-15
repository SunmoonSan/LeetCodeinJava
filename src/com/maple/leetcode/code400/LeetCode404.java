package com.maple.leetcode.code400;

public class LeetCode404 {
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return root.val;
        }

        if (root.left!=null && root.right==null) {
            return sum+sumOfLeftLeaves(root.left);
        }

        return sum + sumOfLeftLeaves(root.right) + sumOfLeftLeaves(root.right);
    }
}
