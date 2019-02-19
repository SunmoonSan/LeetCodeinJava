package com.maple.leetcode.code100;
/*
给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。

在杨辉三角中，每个数是它左上方和右上方的数的和。

示例:
输入: 3
输出: [1,3,3,1]

*/

import java.util.ArrayList;
import java.util.List;

public class LeetCode119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prevRow = new ArrayList<>();  // 上一行
        List<Integer> currRow = new ArrayList<>();  // 当前行
        prevRow.add(1);

        if (rowIndex == 0) {
            return prevRow;
        }

        for (int i = 1; i <= rowIndex; i++) {
            currRow.clear();
            currRow.add(1);
            for (int j = 1; j < i; j++) {
                currRow.add(prevRow.get(j) + prevRow.get(j - 1));
            }
            currRow.add(1);
            prevRow.clear();
            prevRow.addAll(currRow);
        }

        return currRow;
    }

    public static void main(String[] args) {
        LeetCode119 leet = new LeetCode119();
        leet.getRow(0);
    }
}
