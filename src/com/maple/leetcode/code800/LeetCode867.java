package com.maple.leetcode.code800;
/*
给定一个矩阵 A， 返回 A 的转置矩阵。
矩阵的转置是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。

示例 1：
输入：[[1,2,3],[4,5,6],[7,8,9]]
输出：[[1,4,7],[2,5,8],[3,6,9]]

示例 2：
输入：[[1,2,3],[4,5,6]]
输出：[[1,4],[2,5],[3,6]]

提示：

    1 <= A.length <= 1000
    1 <= A[0].length <= 1000
 */

public class LeetCode867 {
    public int[][] transpose(int[][] A) {
        // A的列作为B的行
        int col = A[0].length;
        // A的行作为B的列
        int row = A.length;

        // 转换后的数组
        int[][] B = new int[col][row];

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                B[i][j] = A[j][i];
            }
        }
        return B;
    }

    public static void main(String[] args) {
        LeetCode867 leet = new LeetCode867();
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] C = leet.transpose(a);
        for (int i=0;i<C.length;i++) {
            for (int j=0;j<C[0].length;j++) {
                System.out.print(C[i][j]+" ,");
            }
            System.out.println();
        }
    }
}
