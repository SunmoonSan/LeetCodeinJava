package com.maple.leetcode.code600;

import com.maple.leetcode.code500.LeetCode506;

public class LeetCode606 {
    public static void main(String[] args) {
        LeetCode606 leet = new LeetCode606();
        Integer[] arr = {1, 2, 3, null, 4};
        BinaryTree bt = new BinaryTree(arr);
        String s = leet.tree2str(bt.root);
        System.out.println(s);
    }

    public String tree2str(TreeNode t) {
        StringBuilder builder = new StringBuilder();
        if (t != null) {
            builder.append(t.val);
            tree2str(builder, t);
        }
        return builder.toString();
    }

    private void tree2str(StringBuilder builder, TreeNode t) {
        if (t.left == null && t.right == null) {
            return;
        } else if (t.left != null && t.right == null) {
            builder.append("(");
            builder.append(t.left.val);
            tree2str(builder, t.left);
            builder.append(")");

        } else if (t.left == null && t.right != null) {
            builder.append("(");
            builder.append(")");

            builder.append("(");
            builder.append(t.right.val);
            tree2str(builder, t.right);
            builder.append(")");

        } else {
            builder.append("(");
            builder.append(t.left.val);
            tree2str(builder, t.left);
            builder.append(")");

            builder.append("(");
            builder.append(t.right.val);
            tree2str(builder, t.right);
            builder.append(")");
        }
    }
}
