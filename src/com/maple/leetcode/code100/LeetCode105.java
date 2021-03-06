package com.maple.leetcode.code100;

import java.util.HashMap;
/*
根据一棵树的前序遍历与中序遍历构造二叉树。
注意:
你可以假设树中没有重复的元素。

例如，给出
前序遍历 preorder = [3,9,20,15,7]
中序遍历 inorder = [9,3,15,20,7]
返回如下的二叉树：

    3
   / \
  9  20
    /  \
   15   7


来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class LeetCode105 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> kvs = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            kvs.put(inorder[i], i);
        }

        return buildTree(preorder, 0, preorder.length - 1, kvs, 0, inorder.length - 1);
    }

    private TreeNode buildTree(int[] preorder, int preLeft, int preRight, HashMap<Integer, Integer> kvs, int inLeft, int inRight) {
        if (preLeft > preRight || inLeft > inRight) {
            return null;
        }
        // preLeft, preLeft+1(前序数组左子树左边界),   preLeft+rootIndex-inLeft(前序数组左子树右边界), preLeft+1+rootIndex-inLeft(前序数组右子树右边界), preRight(前序数组右子树右边界)
        // inLeft, rootIndex-1(中序数组左子树左边界),  rootIndex(中序数组左子树右边界),                rootIndex+1(中序数组右子树右边界),                inRight(中序数组右子树右边界)

        int rootIndex = kvs.get(preorder[preLeft]); // 中序数组的根节点索引
        TreeNode root = new TreeNode(preorder[preLeft]); // 创建根节点
        root.left = buildTree(preorder, preLeft + 1, preLeft + rootIndex - inLeft, kvs, inLeft, rootIndex - 1); // 构建左子树
        root.right = buildTree(preorder, preLeft + 1 + rootIndex - inLeft, preRight, kvs, rootIndex + 1, inRight); // 构建右子树
        return root;
    }

    public static void main(String[] args) {
        LeetCode105 leet = new LeetCode105();
    }

}
