package com.maple.leetcode.code400;

public class LeetCode498 {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        } else if (matrix.length == 1) {
            return matrix[0];
        }
        int row = matrix.length;
        int col = matrix[0].length;

        int[] arr = new int[row * col];
        int index = 0;

        int i = 0;
        int j = 0;
        arr[index] = matrix[i][j];
        while (true) {
            // 往右上角扫描
            while (i > 0 && j < col - 1) {
                i--;
                j++;
                index++;
                arr[index] = matrix[i][j];
            }
            if (i == 0 && j != col - 1) {
                j++;
            } else if (j == col - 1) {
                i++;
            }
            arr[++index] = matrix[i][j];

            if (i == row - 1 && j == col - 1) {
                break;
            }

            // 往左下角扫描
            while (j > 0 && i < row - 1) {
                index++;
                i++;
                j--;
                arr[index] = matrix[i][j];
            }
            if (j == 0 && i != row - 1) {
                i++;
            } else if (i == row - 1) {
                j++;
            }
            arr[++index] = matrix[i][j];

            if (i == row - 1 && j == col - 1) {
                break;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        LeetCode498 leet = new LeetCode498();
//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
        int[][] arr = {
                {2,},
                {8,},
                {0,}
        };
        int[] m = leet.findDiagonalOrder(arr);
        System.out.println(m[0]);
    }
}
