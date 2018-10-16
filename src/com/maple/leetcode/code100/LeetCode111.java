package com.maple.leetcode.code100;
/*
给定一个二叉树，找出其最小深度。
最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
说明: 叶子节点是指没有子节点的节点。
示例:
给定二叉树 [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
返回它的最小深度  2.
*/

public class LeetCode111 {
    public int minDepth(TreeNode root) {
        if (root == null) {  // 空树
            return 0;
        } else if (root.left == null && root.right == null) {  // 只有根节点
            return 1;
        } else if (root.left == null && root.right != null) {  // 只有右子树
            return 1 + minDepth(root.right);
        } else if (root.left != null && root.right == null) {  // 只有左子树
            return 1 + minDepth(root.left);
        } else {  // 既有左子树, 又有右子树
            return 1 + Math.min(minDepth(root.left), minDepth(root.right));
        }
    }
}
