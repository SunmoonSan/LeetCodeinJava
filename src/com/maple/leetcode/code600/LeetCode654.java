package com.maple.leetcode.code600;

public class LeetCode654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        TreeNode root=null;
        root = addNode(root, nums, 0, nums.length-1);
        return root;
    }

    public TreeNode addNode(TreeNode node, int[] array, int l, int r) {
        int max = array[0];
        int index = 0;
        for (int i=l;i<=r;i++) {
            if (max<array[i]) {
                max = array[i];
                index = i;
            }
        }


        if (node==null) {
           return new TreeNode(max);
        }

        node.left = addNode(node.left, array, l, index-1);
        node.right = addNode(node.right, array, index+1, r);

        return node;
    }

}
