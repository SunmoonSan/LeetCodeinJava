package com.maple.leetcode;

/**
 给定一个 32 位有符号整数，将整数中的数字进行反转。
 示例 1:

 输入: 123
 输出: 321

 示例 2:

 输入: -123
 输出: -321

 示例 3:

 输入: 120
 输出: 21

 注意:
 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−2(31),  2(31) − 1]。根据这个假设，如果反转后的整数溢出，则返回 0。
 */

public class LeetCode007 {
    public int reverse(int x) {
        int sign = 1;  // 标识整数前的正负号
        if (x < 0) {
            sign = -1;  // 记录负数负号
            x = -x;  // x取相反数
        }
        int[] array = new int[32];

        int i = 0;
        while (x >= 10) {
            int t = x % 10;
            x = (x - t) / 10;
            array[i++] = t;
        }
        array[i] = x;  // x倒序存入数组array

        long sum = 0;
        for (int j = i; j >= 0; j--) {
            sum = sum + (int) (array[j] * Math.pow(10, i - j));
        }

        sum = sum * sign;
        // 判断是否溢出
        if (sum>(Math.pow(2, 31)-1) || sum<-Math.pow(2, 31)) {
            return 0;
        }
        return (int)sum;
    }

    public static void main(String[] args) {
        LeetCode007 leet = new LeetCode007();
        int s = leet.reverse(-2147483648);

        System.out.println(s);
    }
}
