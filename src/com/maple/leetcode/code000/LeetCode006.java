package com.maple.leetcode.code000;
/*
将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：

L   C   I   R
E T O E S I I G
E   D   H   N
之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。
请你实现这个将字符串进行指定行数变换的函数：

string convert(string s, int numRows);
示例 1:
输入: s = "LEETCODEISHIRING", numRows = 3
输出: "LCIRETOESIIGEDHN"
示例 2:
输入: s = "LEETCODEISHIRING", numRows = 4
输出: "LDREOEIIECIHNTSG"
解释:

L     D     R
E   O E   I I
E C   I H   N
T     S     G
 */

import java.util.ArrayList;
import java.util.List;

public class LeetCode006 {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++) {
            rows.add(new StringBuilder());
        }

        int curRow = 0;
        boolean goingDown = true;
        for (char c : s.toCharArray()) {
            if (goingDown) {
                rows.get(curRow).append(c);
                curRow = curRow + 1;
            } else {
                rows.get(curRow).append(c);
                curRow = curRow - 1;
            }

            if (curRow == 0 || curRow == numRows - 1) {
                goingDown = !goingDown;
            }
        }

        StringBuilder builder = new StringBuilder();
        for (StringBuilder row : rows) {
            builder.append(row.toString());
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        String s = "AB";
        int numRows = 1;
        LeetCode006 leet = new LeetCode006();
        leet.convert(s, numRows);
    }
}
