package com.maple.leetcode.code100;

import java.util.Map;

public class LeetCode110 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        int leftDepth = isBalanced(1, root.left);
        int rightDepth = isBalanced(1, root.right);

        return Math.abs(leftDepth - rightDepth) <= 1;
    }

    private int isBalanced(int n, TreeNode root) {
        if (root == null) {
            return n;
        }

        if (root.left == null && root.right == null) {
            return n + 1;
        }

        if (root.left == null) {
            return isBalanced(n + 1, root.right);
        } else if (root.right == null) {
            return isBalanced(n + 1, root.left);
        } else {
            return Math.max(isBalanced(n + 1, root.left), isBalanced(n + 1, root.right));
        }
    }
}
