package com.maple.leetcode.code100;
/*
给定一个二叉树，返回其按层次遍历的节点值。 （即逐层地，从左到右访问所有节点）。
例如:
给定二叉树: [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
返回其层次遍历结果：
[
  [3],
  [9,20],
  [15,7]
]
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
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

            lists.add(integers);
        }
        return lists;
    }

    public static void main(String[] args) {
        LeetCode102 leet = new LeetCode102();
    }

}
