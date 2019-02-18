package com.maple.leetcode.code100;
/*
给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
在杨辉三角中，每个数是它左上方和右上方的数的和。
示例:

输入: 5
输出:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
*/

import java.util.ArrayList;
import java.util.List;

public class LeetCode118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();

        if (numRows == 0) {
            return triangle;
        }

        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(i - 1);

            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j)+prevRow.get(j-1));
            }
            row.add(1);

            triangle.add(row);
        }
        return triangle;
    }

    public static void main(String[] args) {
        LeetCode118 leet = new LeetCode118();
        leet.generate(0);
    }
}
