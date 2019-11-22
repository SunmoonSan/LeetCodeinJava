package com.maple.leetcode.code100;

import java.util.ArrayList;
import java.util.List;

public class LeetCode113 {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();

        if (root == null) {
            return lists;
        }

        pathSum(root, sum, lists, integers);
//        System.out.println(lists);
        return lists;
    }

    private void pathSum(TreeNode root, int sum, List<List<Integer>> lists, List<Integer> integers) {
        if (root.left == null && root.right == null && root.val == sum) {
            integers.add(root.val);
            lists.add(new ArrayList<>(integers));
            return;
        }

        integers.add(root.val);
        if (root.left != null) {
            pathSum(root.left, sum - root.val, lists, integers);
            integers.remove(integers.size() - 1);
        }

        if (root.right != null) {
            pathSum(root.right, sum - root.val, lists, integers);
            integers.remove(integers.size() - 1);
        }

    }

    public static void main(String[] args) {
        LeetCode113 leet = new LeetCode113();
        Integer[] arr = {5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1};
        BinaryTree bt = new BinaryTree(arr);
        leet.pathSum(bt.root, 22);
    }
}
