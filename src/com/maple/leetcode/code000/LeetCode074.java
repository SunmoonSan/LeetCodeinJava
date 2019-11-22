package com.maple.leetcode.code000;

public class LeetCode074 {
    public boolean searchMatrix(int[][] matrix, int target) {

//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (matrix[i][j] == target) {
//                    return true;
//                }
//            }
//        }

        if (matrix.length == 0) {
            return false;
        }

        int t = 0;
        int b = matrix.length - 1;
        int p = 0;
        while (t < b) {
            p = (t + b) / 2;
            if (matrix[p][0] == target) {
                return true;
            } else if (matrix[p][0] < target) {
                t = p + 1;
            } else {
                b = p - 1;
            }
        }
        p = (t + b) / 2;

        int l = 0;
        int r = matrix[0].length - 1;
        int m = 0;
        while (l < r) {
            m = (l + r) / 2;
            if (matrix[p][m] == target) {
                return true;
            } else if (matrix[p][m] < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        LeetCode074 leet = new LeetCode074();
        int[][] arr = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
        };
        boolean b = leet.searchMatrix(arr, 6);
        System.out.println(b);
    }
}
