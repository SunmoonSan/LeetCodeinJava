package com.maple.leetcode.code000;

import java.util.ArrayList;
import java.util.List;

public class LeetCode054 {
    public List<Integer> spiralOrder(int[][] matrix) {

        int i = -1;
        int j = -1;

        int l = 0;  // 左边界
        int b = matrix.length;  // 右边界
        int t = 0;  // 上边界
        int r = matrix[0].length;  // 下边界

        List<Integer> integers = new ArrayList<>();
        while (i <= r && j <= b) {

            i++;
            j++;
            while (j <= r - 1) {
                integers.add(matrix[i][j]);
                j++;

            }
            t++;  // 上边界下移

            i++;
            j--;
            while (i <= b - 1) {

                integers.add(matrix[i][j]);
                i++;
            }
            r--;  // 右边界左移

            i--;
            j--;
            while (j >= l) {
                integers.add(matrix[i][j]);
                j--;
            }
            b--; // 下边界上移


            i--;
            j++;
            while (i >= t) {
                integers.add(matrix[i][j]);
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
        leet.spiralOrder(a);
    }

}
