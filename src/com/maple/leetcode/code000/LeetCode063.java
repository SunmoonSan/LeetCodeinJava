package com.maple.leetcode.code000;

public class LeetCode063 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;

        if (obstacleGrid[0][0] == 1 || obstacleGrid[row - 1][col - 1] == 1) {
            return 0;
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (obstacleGrid[i][j] != 1) {
                    if (i != 0 && j != 0) {
                        if (obstacleGrid[i - 1][j] == 1) {
                            obstacleGrid[i][j] = obstacleGrid[i][j - 1];
                        } else if (obstacleGrid[i][j - 1] == 1) {
                            obstacleGrid[i][j] = obstacleGrid[i - 1][j];
                        } else {
                            obstacleGrid[i][j] = obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
                        }

                    } else {
                        obstacleGrid[i][j] = -1;
                    }
                }
            }
        }

        System.out.println(obstacleGrid);

        return obstacleGrid[row - 1][col - 1] * -1;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };
        LeetCode063 leet = new LeetCode063();
        leet.uniquePathsWithObstacles(arr)
        ;
    }
}
