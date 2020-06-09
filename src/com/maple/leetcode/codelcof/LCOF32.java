package com.maple.leetcode.codelcof;
/*
 * @desc : Created by San on 2020-06-03 18:47
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LCOF32 {
    public int[] levelOrder(TreeNode root) {
        List<Integer> integers = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }

            integers.add(node.val);
        }

        int[] leaves = new int[integers.size()];
        for (int i = 0; i < leaves.length; i++) {
            leaves[i] = integers.get(i);
        }

        return leaves;
    }

    public static void main(String[] args) {
        LCOF32 lcof = new LCOF32();
        Integer[] arr = {3, 9, 20, null, null, 15, 7};
//        Integer[] arr = {3, 9, 20};
        BinaryTree bt = new BinaryTree(arr);
        lcof.levelOrder(bt.root);
    }
}
