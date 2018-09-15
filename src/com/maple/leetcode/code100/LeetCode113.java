package com.maple.leetcode.code100;

import java.util.ArrayList;
import java.util.List;

public class LeetCode113 {
    List<List<Integer>> lists = new ArrayList<>();
    List<Integer> integers = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        if (root == null) {
            return lists;
        }

        pathSum(root, sum, lists, integers);
        return lists;
    }

    private void pathSum(TreeNode root, int sum, List<List<Integer>> lists, List<Integer> integers) {
        if (root.left==null && root.right==null && root.val==sum) {
            integers.add(root.val);
            lists.add(integers);
            integers.remove(integers.size()-1);
        }


    }
}
