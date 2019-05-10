package com.maple.leetcode.code500;
/*
 * @desc : Created by San on 2019-05-01 17:14
 */

/*
您需要在二叉树的每一行中找到最大的值。

示例：

输入:

          1
         / \
        3   2
       / \   \
      5   3   9

输出: [1, 3, 9]
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode515 {
    public List<Integer> largestValues(TreeNode root) {
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

            int max = Integer.MIN_VALUE;
            for (TreeNode node : treeNodes) {
                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }

                max = Math.max(max, node.val);
            }

            list.add(max);

        }

        return list;
    }

    public static void main(String[] args) {
        LeetCode515 leet = new LeetCode515();
        Integer[] array = {1, 3, 2, 5, 3, 9};
        BinaryTree bt = new BinaryTree(array);
        leet.largestValues(bt.root);
    }
}
