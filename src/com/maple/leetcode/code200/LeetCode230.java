package com.maple.leetcode.code200;
/*
 * @desc : Created by San on 2019-05-02 00:36
 */

import java.util.Comparator;
import java.util.PriorityQueue;

public class LeetCode230 {
    public int kthSmallest(TreeNode root, int k) {

        PriorityQueue<TreeNode> pq = new PriorityQueue<>(new Comparator<TreeNode>() {
            @Override
            public int compare(TreeNode o1, TreeNode o2) {
                return o2.val - o1.val;
            }
        });

        kthSmallest(root, k, pq);

        return pq.remove().val;
    }

    private void kthSmallest(TreeNode node, int k, PriorityQueue<TreeNode> pq) {
        if (node == null) {
            return;
        }

        pq.add(node);
        if (pq.size() > k) {
            pq.remove();
        }
        kthSmallest(node.left, k, pq);
        kthSmallest(node.right, k, pq);
    }

    public static void main(String[] args) {
        LeetCode230 leet = new LeetCode230();
        Integer[] array = {5, 3, 6, 2, 4, null, null, 1};
        BinaryTree bt = new BinaryTree(array);
        leet.kthSmallest(bt.root, 3);
    }
}
