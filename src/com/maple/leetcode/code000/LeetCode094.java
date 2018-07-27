package com.maple.leetcode.code000;
/*
给定一个二叉树，返回它的中序 遍历。
示例:
输入: [1,null,2,3]
   1
    \
     2
    /
   3
输出: [1,3,2]
进阶: 递归算法很简单，你可以通过迭代算法完成吗？
 */

import java.util.ArrayList;
import java.util.List;

public class LeetCode094 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }

        if (root.left != null) {  // 访问左子树
            list.addAll(inorderTraversal(root.left));
        }

        list.add(root.val);  // 访问根节点

        if (root.right != null) { // 访问右子树
            list.addAll(inorderTraversal(root.right));
        }

        return list;
    }

    public static void main(String[] args) {
        LeetCode094 leet = new LeetCode094();
//        leet.inorderTraversal();
    }
}
