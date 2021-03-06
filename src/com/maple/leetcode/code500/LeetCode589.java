package com.maple.leetcode.code500;
/*
给定一个N叉树，返回其节点值的前序遍历。
例如，给定一个 3叉树 :
         1
        /| \
       / |  \
      3  2   4
     / \
    5   6
返回其前序遍历: [1,3,5,6,2,4]。
说明: 递归法很简单，你可以使用迭代法完成此题吗?

 */

import java.util.ArrayList;
import java.util.List;


public class LeetCode589 {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }

        list.add(root.val);
        for (int i = 0; i < root.children.size(); i++) {
            list.addAll(preorder(root.children.get(i)));
        }

        return list;
    }

}
