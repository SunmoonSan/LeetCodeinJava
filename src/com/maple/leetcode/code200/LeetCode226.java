package com.maple.leetcode.code200;
/*
翻转一棵二叉树。
示例：
输入：
     4
   /   \
  2     7
 / \   / \
1   3 6   9

输出：
     4
   /   \
  7     2
 / \   / \
9   6 3   1
备注:
这个问题是受到 Max Howell 的 原问题 启发的 ：
    谷歌：我们90％的工程师使用您编写的软件(Homebrew)，但是您却无法在面试时在白板上写出翻转二叉树这道题，这太糟糕了。
 */

public class LeetCode226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        // 交换左右节点
        TreeNode node = root.left;
        root.left = root.right;
        root.right = node;

        // 递归交换左子树
        root.left = invertTree(root.left);
        // 递归交换右子树
        root.right = invertTree(root.right);

        return root;
    }
}
