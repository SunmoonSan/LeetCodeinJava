package com.maple.leetcode.code200;
/*
 * @desc : Created by San on 2019-04-30 17:06
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if (root == null) {
            return list;
        }

        Stack<Integer> stack = new Stack<>();
        binaryTreePaths(root, "", list);
//        System.out.println(list);
        return list;
    }

    private void binaryTreePaths(TreeNode root, String res, List<String> list) {
        if (root.left == null && root.right == null) {
            System.out.println(res+root.val);
            list.add(res+root.val);
            return;
        }

        if (root.left!=null) {
            binaryTreePaths(root.left, res +root.val+ "->" , list);
        }

        if (root.right!=null) {
            binaryTreePaths(root.right, res +root.val+ "->", list);
        }
    }


    public static void main(String[] args) {
        LeetCode257 leet = new LeetCode257();
        Integer[] arr = {1, 2, 3, 4, 5};
        BinaryTree bt = new BinaryTree(arr);
        leet.binaryTreePaths(bt.root);
    }
}
