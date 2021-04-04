package com.maple.leetcode.codeF00;

public class LeetCode1572 {
    public static void main(String[] args) {
        LeetCode1572 leet = new LeetCode1572();
        int[][] mat = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };
        leet.diagonalSum(mat);
    }

    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum = sum + mat[i][i] + mat[i][mat.length - 1 - i];
        }
        if (mat.length % 2 == 1) {
            sum = sum - mat[mat.length / 2][mat.length / 2];
        }
        return sum;
    }
}
