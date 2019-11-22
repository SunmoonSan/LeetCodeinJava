package com.maple.leetcode.code800;

public class LeetCode885 {
    public int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
        int[][] XYs = new int[R * C][2];
        int count = 0;


        while (count < R * C) {
            XYs[count++] = new int[]{r0, c0};
        }

        return new int[][]{};
    }
}
