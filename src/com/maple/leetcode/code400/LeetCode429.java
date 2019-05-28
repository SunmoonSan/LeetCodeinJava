package com.maple.leetcode.code400;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode429 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> lists = new ArrayList<>();
        if (root == null) {
            return lists;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            List<Node> nodes = new ArrayList<>();
            while (!queue.isEmpty()) {
                nodes.add(queue.remove());
            }

            List<Integer> integers = new ArrayList<>();
            for (Node node : nodes) {
                integers.add(node.val);
                if (node.children != null) {
                    queue.addAll(node.children);
                }
            }

            lists.add(integers);
        }

        return lists;
    }
}
