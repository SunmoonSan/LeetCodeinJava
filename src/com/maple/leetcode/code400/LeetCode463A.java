package com.maple.leetcode.code400;

public class LeetCode463A {
    public int islandPerimeter(int[][] grid) {
        int len = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    len += 4;

                    if (i - 1 >= 0) {
                        if (grid[i - 1][j] == 1) {
                            len--;
                        }
                    }

                    if (i + 1 < grid.length) {
                        if (grid[i + 1][j] == 1) {
                            len--;
                        }
                    }

                    if (j - 1 >= 0) {
                        if (grid[i][j - 1] == 1) {
                            len--;
                        }
                    }

                    if (j + 1 < grid[i].length) {
                        if (grid[i][j + 1] == 1) {
                            len--;
                        }
                    }

                }
            }

        }
        return len;
    }

    public static void main(String[] args) {
        LeetCode463A leet = new LeetCode463A();
        int[][] s = {
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}};
        leet.islandPerimeter(s);
    }
}
