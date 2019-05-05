package com.maple.leetcode.code100;
/*
 * @desc : Created by San on 2019-05-01 08:15
 */

/*
给定一个二叉树，返回其节点值的锯齿形层次遍历。
（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。
例如：
给定二叉树 [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
返回锯齿形层次遍历如下：

[
  [3],
  [20,9],
  [15,7]
]
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if (root == null) {
            return lists;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean leftToRight = true;  // 从左向右遍历标志
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

            List<Integer> integers = new ArrayList<>();
            if (leftToRight) { // 从左向右
                for (TreeNode node : treeNodes) {
                    integers.add(node.val);
                }
            } else { // 从右向左
                for (int i = treeNodes.size() - 1; i >= 0; i--) {
                    TreeNode node = treeNodes.get(i);
                    integers.add(node.val);
                }
            }

            lists.add(integers);
            leftToRight = !leftToRight;
        }

        return lists;
    }

    public static void main(String[] args) {
        LeetCode103 leet = new LeetCode103();
        Integer[] array = {3, 9, 20, null, null, 15, 7};
        BinaryTree bt = new BinaryTree(array);
        leet.zigzagLevelOrder(bt.root);
    }
}
