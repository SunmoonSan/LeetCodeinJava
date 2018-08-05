package com.maple.leetcode.code000;
/*
给定一个正整数 n，生成一个包含 1 到 n*n 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。

示例:
输入: 3
输出:
[
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
]
 */

public class LeetCode059 {
    public int[][] generateMatrix(int n) {
        int[][] m = new int[n][n];

        int i=0;
        int j=0;
        m[i][j] = 1;

        int l=0;  // 左边界
        int r = n-1;  // 右边界
        int t = 0;  // 上边界
        int b = n-1;  // 下边界

        while (i<=r && j<=b) {
            while (j<=r-1) {
                m[i][j+1] = m[i][j] +1;
                j++;

            }
            t++;  // 上边界下移

            while (i<=b-1) {
                m[i+1][j] = m[i][j]+1;
                i++;

            }
            r--;  // 右边界左移

            while (j>=l+1) {
                m[i][j-1] = m[i][j]+1;
                j--;
            }
            b--; // 下边界上移

            while (i>=t+1) {
                m[i-1][j]= m[i][j]+1;
                i--;
            }
            l++; // 左边界右移

        }

        return m;
    }

    public static void main(String[] args) {
        LeetCode059 leet = new LeetCode059();
        leet.generateMatrix(4);
    }
}
