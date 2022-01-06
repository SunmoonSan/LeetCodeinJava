package com.maple.leetcode.code400;

public class LeetCode463B {
    public static void main(String[] args) {
        LeetCode463B leet = new LeetCode463B();
        int[][] s = {
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}};
        leet.islandPerimeter(s);
    }

    public int islandPerimeter(int[][] grid) {
        int len = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    if (j == 0 || grid[i][j - 1] == 0) {
                        len++;
                    }

                    if (j == grid[i].length - 1 || grid[i][j + 1] == 0) {
                        len++;
                    }

                    if (i == 0 || grid[i - 1][j] == 0) {
                        len++;
                    }

                    if (i == grid.length - 1 || grid[i + 1][j] == 0) {
                        len++;
                    }
                }
            }
        }
        return len;
    }
}
