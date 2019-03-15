package com.maple.leetcode.code600;
/*
给定一个非空二叉树, 返回一个由每层节点平均值组成的数组.
示例 1:
输入:
    3
   / \
  9  20
    /  \
   15   7
输出: [3, 14.5, 11]
解释:
第0层的平均值是 3,  第1层是 14.5, 第2层是 11. 因此返回 [3, 14.5, 11].
注意：
节点值的范围在32位有符号整数范围内。
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> lists = new ArrayList<>();
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

            double sum = 0;
            for (TreeNode tree : treeNodes) {
                sum += tree.val;

                if (tree.left != null) {
                    queue.add(tree.left);
                }

                if (tree.right != null) {
                    queue.add(tree.right);
                }

            }

            lists.add(sum / treeNodes.size());

        }
        return lists;
    }

}
