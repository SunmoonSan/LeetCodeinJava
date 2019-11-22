package com.maple.leetcode.code900;

public class LeetCode999 {
    public int numRookCaptures(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'R') {
                    int m = i;
                    int n = j;
                    while (m > 0) {
                        if (board[m - 1][n] == 'B') {
                            break;
                        } else if (board[m - 1][n] == 'p') {
                            count++;
                            break;
                        }
                        m--;
                    }

                    m = i;
                    n = j;
                    while (m < board.length - 1) {
                        if (board[m + 1][n] == 'B') {
                            break;
                        } else if (board[m + 1][n] == 'p') {
                            count++;
                            break;
                        }
                        m++;
                    }

                    m = i;
                    n = j;
                    while (n > 0) {
                        if (board[m][n - 1] == 'B') {
                            break;
                        } else if (board[m][n - 1] == 'p') {
                            count++;
                            break;
                        }
                        n--;
                    }

                    m = i;
                    n = j;
                    while (n < board[i].length - 1) {
                        if (board[m][n + 1] == 'B') {
                            break;
                        } else if (board[m][n + 1] == 'p') {
                            count++;
                            break;
                        }
                        n++;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        char[][] s = {
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'p', 'p', '.', 'R', '.', 'p', 'B', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', 'B', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'}
        };
        LeetCode999 leeet = new LeetCode999();
        int n = leeet.numRookCaptures(s);
        System.out.println(n);

    }
}
