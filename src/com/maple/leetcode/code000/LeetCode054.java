package com.maple.leetcode.code000;
/*
给定一个包含 m x n 个元素的矩阵（m 行, n 列），请按照顺时针螺旋顺序，返回矩阵中的所有元素。
示例 1:
输入:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
输出: [1,2,3,6,9,8,7,4,5]

示例 2:
输入:
[
  [1, 2, 3, 4],
  [5, 6, 7, 8],
  [9,10,11,12]
]
输出: [1,2,3,4,8,12,11,10,9,5,6,7]
*/

import java.util.ArrayList;
import java.util.List;

public class LeetCode054 {
    public List<Integer> spiralOrder(int[][] matrix) {
        // 当输入[]时, 直接返回[]
        if (matrix.length == 0) {
            return new ArrayList<>();
        }

        int i = -1;  // 初始化i索引
        int j = -1;  // 初始化j索引

        int l = 0;  // 左边界
        int r = matrix[0].length - 1;  // 右边界
        int t = 0;  // 上边界
        int b = matrix.length - 1;  // 下边界

        int size = (r + 1) * (b + 1);  // 数组matrix的元素总个数

        List<Integer> integers = new ArrayList<>();
        while (i <= r && j <= b) {

            // 开始向右遍历
            i++;
            j++;
            while (j <= r) {
                integers.add(matrix[i][j]);
                size--; // 元素总数减１
                if (size == 0) {
                    return integers;
                }
                j++; // i不变, 向右遍历

            }
            t++;  // 上边界下移

            // 开始向下遍历
            i++;
            j--;
            while (i <= b) {
                integers.add(matrix[i][j]);
                size--; // 元素总数减１
                if (size == 0) {
                    return integers;
                }
                i++; //j不变,向下遍历
            }
            r--;  // 右边界左移

            // 开始向左遍历
            i--;
            j--;
            while (j >= l) {
                integers.add(matrix[i][j]);
                size--; // 元素总数减１
                if (size == 0) {
                    return integers;
                }
                j--;
            }
            b--; // 下边界上移


            // 开始向上遍历
            i--;
            j++;
            while (i >= t) {
                integers.add(matrix[i][j]);
                size--; // 元素总数减１
                if (size == 0) {
                    return integers;
                }
                i--;
            }
            l++; // 左边界右移

        }
        return integers;
    }

    public static void main(String[] args) {
        LeetCode054 leet = new LeetCode054();
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] b = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        int[][] c = {};
        List<Integer> integers = leet.spiralOrder(c);
        System.out.println(integers);
    }

}
