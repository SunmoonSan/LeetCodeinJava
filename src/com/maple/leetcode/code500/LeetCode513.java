package com.maple.leetcode.code500;
/*
给定一个二叉树，在树的最后一行找到最左边的值。

示例 1:
输入:

    2
   / \
  1   3

输出:
1


示例 2:
输入:

        1
       / \
      2   3
     /   / \
    4   5   6
       /
      7

输出:
7

注意: 您可以假设树（即给定的根节点）不为 NULL。
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode513 {
    public int findBottomLeftValue(TreeNode root) {
        int target;
        List<List<TreeNode>> lists = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<TreeNode> treeNodes = new ArrayList<>();
            while (!queue.isEmpty()) {
                treeNodes.add(queue.remove());
            }

            for (TreeNode node : treeNodes) {
                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }

            lists.add(treeNodes);
        }

        return lists.get(lists.size() - 1).get(0).val;
    }

    public static void main(String[] args) {
        LeetCode513 leet = new LeetCode513();
        Integer[] arr = {1, 2, 3, 4, 5, 6, null, null, 7};
        BinaryTree bt = new BinaryTree(arr);
        leet.findBottomLeftValue(bt.root);
    }
}
