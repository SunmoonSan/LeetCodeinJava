package com.maple.leetcode.code000;
/*
给定一个 n × n 的二维矩阵表示一个图像。
将图像顺时针旋转 90 度。
说明：
你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。
示例 1:
给定 matrix =
[
  [1,2,3],
  [4,5,6],
  [7,8,9]
],  原地旋转输入矩阵，使其变为:
[
  [7,4,1],
  [8,5,2],
  [9,6,3]
]
示例 2:
给定 matrix =
[
  [ 5, 1, 9,11],
  [ 2, 4, 8,10],
  [13, 3, 6, 7],
  [15,14,12,16]
],  原地旋转输入矩阵，使其变为:
[
  [15,13, 2, 5],
  [14, 3, 4, 1],
  [12, 6, 8, 9],
  [16, 7,10,11]
]
 */

public class LeetCode048 {
    public void rotate(int[][] matrix) {
        int len = matrix.length;

        // 以(0,0)--(len-1,len-1)中线对称旋转
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }

        // 以竖直线反转180度
        for (int i = 0; i < len; i++) {
            int l = 0; // 左索引
            int h = matrix[i].length - 1;  // 右索引

            while (l < h) {
                int t = matrix[i][l];
                matrix[i][l] = matrix[i][h];
                matrix[i][h] = t;

                l++;
                h--;
            }
        }
    }

    public static void main(String[] args) {
        LeetCode048 leet = new LeetCode048();
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        leet.rotate(a);
    }
}
