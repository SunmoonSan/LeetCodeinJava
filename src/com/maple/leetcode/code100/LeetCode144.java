package com.maple.leetcode.code100;
/*
给定一个二叉树，返回它的 前序 遍历。
 示例:
输入: [1,null,2,3]
   1
    \
     2
    /
   3
输出: [1,2,3]
进阶: 递归算法很简单，你可以通过迭代算法完成吗？
 */

import java.util.ArrayList;
import java.util.List;

public class LeetCode144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }

        list.add(root.val);  // 访问根节点

        if (root.left != null) {  // 访问左子树
            list.addAll(preorderTraversal(root.left));
        }

        if (root.right != null) { // 访问右子树
            list.addAll(preorderTraversal(root.right));
        }

        return list;
    }
}
