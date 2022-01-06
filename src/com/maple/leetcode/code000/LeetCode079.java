package com.maple.leetcode.code000;

/**
 * @author San
 * @time 2022/1/5 19:23:34
 * @desc
 */
public class LeetCode079 {
    public static void main(String[] args) {
        LeetCode079 leet = new LeetCode079();
        char[][] board = {
                {'A'}
        };
        String word = "A";
        boolean b = leet.exist(board, word);
        System.out.println(b);
    }

    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (find(board, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean find(char[][] board, int i, int j, String word, int k) {
        if (k >= word.length()) {
            return true;
        }

        if (i < 0 || i == board.length || j < 0 || j == board[i].length || board[i][j] != word.charAt(k)) {
            return false;
        }

        char tmp = board[i][j];
        board[i][j] = '.';
        boolean res = find(board, i - 1, j, word, k + 1) || find(board, i, j + 1, word, k + 1) || find(board, i + 1, j, word, k + 1) || find(board, i, j - 1, word, k + 1);
        board[i][j] = tmp;
        return res;
    }
}
