package com.maple.leetcode.code100;

public class LeetCode104 {
    public int maxDepth(TreeNode root) {
        /*if (root == null) {  // 空树
            return 0;
        } else if (root.left == null && root.right == null) {  // 只有根节点
            return 1;
        } else if (root.left != null && root.right == null) {  // 只有左子树
            return 1 + maxDepth(root.left);
        } else if (root.left == null && root.right != null) {  // 只有右子树
            return 1 + maxDepth(root.right);
        } else {  // 既有左子树, 又有右子树
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        }*/
        if (root == null) {
            return 0;
        } else {
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        }
    }
}
