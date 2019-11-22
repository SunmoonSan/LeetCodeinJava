package com.maple.leetcode.code200;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    public TreeNode root;

    BinaryTree(Integer[] array) {
        root = new TreeNode(array[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int index = 1;
        while (index < array.length && !queue.isEmpty()) {
            TreeNode node = queue.remove();
            if (array[index] != null) {
                node.left = new TreeNode(array[index]);
                queue.add(node.left);
            }
            index++;

            if (index < array.length && array[index] != null) {
                node.right = new TreeNode(array[index]);
                queue.add(node.right);
            }
            index++;

        }
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(this.root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            res.append(node.val).append(" ");
            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        BinaryTree tree = new BinaryTree(arr);
        System.out.println(tree);
    }
}
