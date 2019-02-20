package com.maple.leetcode.code100;
/*
给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。

例如，给定三角形：

[
     [2],
    [3,4],
   [6,5,7],
  [4,1,8,3]
]
自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。

说明：

如果你可以只使用 O(n) 的额外空间（n 为三角形的总行数）来解决这个问题，那么你的算法会很加分。
 */

import java.util.ArrayList;
import java.util.List;

public class LeetCode120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        for (int i = triangle.size() - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int min = Math.min(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1));
                triangle.get(i).set(j, min + triangle.get(i).get(j));
            }
        }
        return triangle.get(0).get(0);
    }

    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<>();
//        [
//  [2],
//  [3,4],
//  [6,5,7],
//  [4,1,8,3]
//]
        List<Integer> row1 = new ArrayList<>();
        row1.add(2);
        lists.add(row1);
        List<Integer> row2 = new ArrayList<>();
        row2.add(3);
        row2.add(4);
        lists.add(row2);
        List<Integer> row3 = new ArrayList<>();
        row3.clear();
        row3.add(6);
        row3.add(5);
        row3.add(7);
        lists.add(row3);
        List<Integer> row4 = new ArrayList<>();
        row4.add(4);
        row4.add(1);
        row4.add(8);
        row4.add(3);
        lists.add(row4);
        System.out.println(lists);
        LeetCode120 leet = new LeetCode120();
        int min = leet.minimumTotal(lists);
        System.out.println(min);
    }
}
