package com.maple.leetcode.code600;
/*
 * @desc : Created by San on 2019-05-02 00:03
 */

import java.util.Comparator;
import java.util.PriorityQueue;

public class LeetCode671 {
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) {
            return -1;
        }

        PriorityQueue<TreeNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

        findSecondMinimumValue(root, pq);

        if (pq.size() >= 2) {
            pq.remove();
            return pq.remove().val;
        }
        return -1;
    }

    private void findSecondMinimumValue(TreeNode root, PriorityQueue<TreeNode> pq) {
        if (root == null) {
            return;
        }

        if (!pq.isEmpty()) {
            int min = pq.peek().val;
            if (root.val > min) {
                pq.add(root);
            }
        } else {
            pq.add(root);
        }

        findSecondMinimumValue(root.left, pq);
        findSecondMinimumValue(root.right, pq);
    }

    public static void main(String[] args) {
        LeetCode671 leet = new LeetCode671();
        Integer[] array = {1, 1, 3, 1, 1, 3, 4, 3, 1, 1, 1, 3, 8, 4, 8, 3, 3, 1, 6, 2, 1};
        BinaryTree bt = new BinaryTree(array);
        int n = leet.findSecondMinimumValue(bt.root);
        System.out.println(n);
    }
}
