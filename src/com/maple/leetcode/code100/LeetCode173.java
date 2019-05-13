package com.maple.leetcode.code100;
/*
 * @desc : Created by San on 2019-05-04 08:47
 */

/*
实现一个二叉搜索树迭代器。你将使用二叉搜索树的根节点初始化迭代器。

调用 next() 将返回二叉搜索树中的下一个最小的数。

示例：
BSTIterator iterator = new BSTIterator(root);
iterator.next();    // 返回 3
iterator.next();    // 返回 7
iterator.hasNext(); // 返回 true
iterator.next();    // 返回 9
iterator.hasNext(); // 返回 true
iterator.next();    // 返回 15
iterator.hasNext(); // 返回 true
iterator.next();    // 返回 20
iterator.hasNext(); // 返回 false
 */

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LeetCode173 {
    public static void main(String[] args) {
        Integer[] array = {null};
        BinaryTree bt = new BinaryTree(array);
        BSTIterator iter = new BSTIterator(bt.root);
        System.out.println(iter.next());
        System.out.println(iter.next());
        System.out.println(iter.hasNext());
        System.out.println(iter.next());
        System.out.println(iter.hasNext());
        System.out.println(iter.next());
        System.out.println(iter.hasNext());
        System.out.println(iter.next());
        System.out.println(iter.hasNext());
    }
}

class BSTIterator {
    private PriorityQueue<TreeNode> pq;

    public BSTIterator(TreeNode root) {
        pq = new PriorityQueue<>(new Comparator<TreeNode>() {
            @Override
            public int compare(TreeNode o1, TreeNode o2) {
                return o1.val - o2.val;
            }
        });
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            pq.add(node);
            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

    /**
     * @return the next smallest number
     */
    public int next() {
        return this.pq.remove().val;
    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return !this.pq.isEmpty();
    }
}
