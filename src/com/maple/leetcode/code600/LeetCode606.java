package com.maple.leetcode.code600;

public class LeetCode606 {
    public String tree2str(TreeNode t) {
        StringBuilder builder = new StringBuilder();
        tree2str(builder, t);
        return builder.toString();
    }

    private void tree2str(StringBuilder builder, TreeNode t) {
        if (t == null) {
            return;
        }

        builder.append(t.val);
        if (t.left != null) {
            builder.append("(");
            tree2str(builder, t.left);
            builder.append(")");
        }

        if (t.right != null) {
            builder.append("(");
            tree2str(builder, t.right);
            builder.append(")");
        }

    }
}
