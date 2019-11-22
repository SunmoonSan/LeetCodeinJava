package com.maple.leetcode.code500;

public class LeetCode559 {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }

        if (root.children.size() == 0) {
            return 1;
        }

        int max = 0;
        int sum = 0;
        for (Node node : root.children) {
            if (node != null) {
                sum = 1 + maxDepth(node);
                if (sum > max){
                    max = sum;
                }
            }
        }

        return max;
    }
}
