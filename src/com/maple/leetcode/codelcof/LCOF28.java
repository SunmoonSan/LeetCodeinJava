package com.maple.leetcode.codelcof;

public class LCOF28 {
    public static void main(String[] args) {
        LCOF28 lcof = new LCOF28();
//        Integer[] arr = {1, 2, 2, 3, 4, 4, 3};
        Integer[] arr = {1, 2, 2, null, 3, null, 3};
        BinaryTree bt = new BinaryTree(arr);
        boolean b = lcof.isSymmetric(bt.root);
        System.out.println(b);
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isEqual(root.left, root.right);
    }

    private boolean isEqual(TreeNode n1, TreeNode n2) {
        if (n1 == null && n2 == null) {
            return true;
        }

        if (n1 == null && n2 != null) {
            return false;
        }

        if (n1 != null && n2 == null) {
            return false;
        }

        return n1.val == n2.val && isEqual(n1.left, n2.right) && isEqual(n1.right, n2.left);
    }
}
