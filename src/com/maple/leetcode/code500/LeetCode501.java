package com.maple.leetcode.code500;
/*
 * @desc : Created by San on 2019-05-01 22:57
 */

import java.math.BigInteger;
import java.util.*;

public class LeetCode501 {
    public int[] findMode(TreeNode root) {
        if (root==null) {
            return new int[]{};
        }

        List<Integer> integers = new ArrayList<>();
        Map<Integer, Integer> kvs = new HashMap<>();
        findMode(root, kvs);

        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> kvs.get(o2) - kvs.get(o1));
        pq.addAll(kvs.keySet());

        int k = pq.remove();
        int max = kvs.get(k);
        integers.add(k);
        while (!pq.isEmpty()) {
            if (kvs.get(pq.peek()) == max) {
                integers.add(pq.remove());
            } else {
                break;
            }
        }

        int[] nums = new int[integers.size()];
        for (int i = 0; i < integers.size(); i++) {
            nums[i] = integers.get(i);
        }

        return nums;
    }

    private void findMode(TreeNode root, Map<Integer, Integer> kvs) {
        if (root == null) {
            return;
        }

        if (kvs.containsKey(root.val)) {
            kvs.put(root.val, kvs.get(root.val) + 1);
        } else {
            kvs.put(root.val, 1);
        }
        findMode(root.left, kvs);
        findMode(root.right, kvs);
    }


    public static void main(String[] args) {
        LeetCode501 leet = new LeetCode501();
        Integer[] array = {19};
        BinaryTree bt = new BinaryTree(array);
        leet.findMode(bt.root);
    }
}
