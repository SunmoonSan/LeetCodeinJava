package com.maple.leetcode.code400;
/*
两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
给出两个整数 x 和 y，计算它们之间的汉明距离。
注意：
0 ≤ x, y < 231.

示例:
输入: x = 1, y = 4

输出: 2
解释:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑
上面的箭头指出了对应二进制位不同的位置。
*/

public class LeetCode461 {

    public int hammingDistance(int x, int y) {

        String strX = toBinary(x);
        String strY = toBinary(y);

        int len;
        int lenX = strX.length();
        int lenY = strY.length();

        if (strX.length() < strY.length()) { //100, 1 要补全1为001;
            len = lenY;
            for (int i = 0; i < len - lenX; i++) {
                strX = "0".concat(strX);
            }
        } else {
            len = lenX;
            for (int i = 0; i < len - lenY; i++) {
                strY = "0".concat(strY);
            }
        }

        int count = 0;
        for (int i = 0; i < len; i++) {
            if (strX.charAt(i) != strY.charAt(i)) {
                count++;
            }
        }

        return count;
    }

    // 转为2进制
    public String toBinary(int n) {
        StringBuilder res = new StringBuilder();
        while (n >= 2) {
            int r = n % 2;
            n = (n - r) / 2;
            res.append(r);
        }
        res.append(n);
        res.reverse();
        return res.toString();
    }

    public static void main(String[] args) {
        LeetCode461 leet = new LeetCode461();
        int n = leet.hammingDistance(1, 4);
        System.out.println(n);
    }
}
