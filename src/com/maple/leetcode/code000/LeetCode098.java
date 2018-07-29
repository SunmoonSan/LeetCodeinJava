package com.maple.leetcode.code000;
/*
给定一个二叉树，判断其是否是一个有效的二叉搜索树。
一个二叉搜索树具有如下特征：
    节点的左子树只包含小于当前节点的数。
    节点的右子树只包含大于当前节点的数。
    所有左子树和右子树自身必须也是二叉搜索树。
示例 1:
输入:
    2
   / \
  1   3
输出: true

示例 2:
输入:
    5
   / \
  1   4
     / \
    3   6
输出: false
解释: 输入为: [5,1,4,null,null,3,6]。
     根节点的值为 5 ，但是其右子节点值为 4 。
 */

import java.util.ArrayList;
import java.util.List;

public class LeetCode098 {
    public boolean isValidBST(TreeNode root) {
        List<Integer> list = inorderTraversal(root);
        for (int i = 0; i < list.size()-1; i++) {
            // 从前向后比较,前一个元素不小于后一个即为False
            if (list.get(i) >= list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    // 中序遍历二叉搜索树
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
}
