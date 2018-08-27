package com.maple.leetcode.code200;
/*
给定一个整数数组，判断是否存在重复元素。
如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。

示例 1:
输入: [1,2,3,1]
输出: true

示例 2:
输入: [1,2,3,4]
输出: false

示例 3:
输入: [1,1,1,3,3,4,3,2,4,2]
输出: true
*/

import java.util.HashSet;
import java.util.Set;

public class LeetCode217 {
    public boolean containsDuplicate(int[] nums) {
        // 从左往右扫描,将set没有的元素加入, 若set中已经存在,则返回false
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (set.contains(n)) {
                return true;
            } else {
                set.add(n);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        LeetCode217 leet = new LeetCode217();
        int[] a = {1, 2, 3, 1};
        int[] c = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        int[] d = {1, 2, 3, 4};
        boolean b = leet.containsDuplicate(d);
        System.out.println(b);
    }
}
