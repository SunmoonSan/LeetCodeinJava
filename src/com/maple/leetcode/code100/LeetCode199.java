package com.maple.leetcode.code100;
/*
给定一棵二叉树，想象自己站在它的右侧，按照从顶部到底部的顺序，返回从右侧所能看到的节点值。

示例:

输入: [1,2,3,null,5,null,4]
输出: [1, 3, 4]
解释:

   1            <---
 /   \
2     3         <---
 \     \
  5     4       <---
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }

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

            list.add(treeNodes.get(treeNodes.size() - 1).val);
        }
        return list;
    }

    public static void main(String[] args) {
        LeetCode199 leet = new LeetCode199();
        Integer[] arr = {1, 2, 3, -1, 5, -1, 4};
        BinaryTree tree = new BinaryTree(arr);
        leet.rightSideView(tree.root);
    }
}
