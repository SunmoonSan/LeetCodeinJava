package com.maple.leetcode.code900;
/*
给定两个整数 A 和 B，返回任意字符串 S，要求满足：

S 的长度为 A + B，且正好包含 A 个 'a' 字母与 B 个 'b' 字母；
子串 'aaa' 没有出现在 S 中；
子串 'bbb' 没有出现在 S 中。

示例 1：
输入：A = 1, B = 2
输出："abb"
解释："abb", "bab" 和 "bba" 都是正确答案。

示例 2：
输入：A = 4, B = 1
输出："aabaa"

提示：

1. 0 <= A <= 100
2. 0 <= B <= 100
3. 对于给定的 A 和 B，保证存在满足要求的 S。
*/

public class LeetCode984 {
    public String strWithout3a3b(int A, int B) {
        StringBuilder builder = new StringBuilder();
        boolean flag = true;
        while (flag) {
            if (A > B) { // A>B , 追加一个aab, A-2, B-1
                builder.append('a').append('a').append('b');
                A = A - 2;
                B = B - 1;
            } else if (A < B) { // A<B, 追加一个bba, A-1, B-2
                builder.append('b').append('b').append('a');
                A = A - 1;
                B = B - 2;
            } else { // A==b, 追加一个ab, A-1, B-1
                builder.append('a').append('b');
                A = A - 1;
                B = B - 1;
            }

            if (A == 0) {
                for (int i = 0; i < B; i++) {
                    builder.append('b');
                }
                flag = false;
            }

            if (B == 0) {
                for (int i = 0; i < A; i++) {
                    builder.append('a');
                }
                flag = false;
            }
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        LeetCode984 leet = new LeetCode984();
        String s = leet.strWithout3a3b(4, 1);
        System.out.println(s);
    }
}
