package com.maple.leetcode.code200;

/**
 *
 * 统计所有小于非负整数 n 的质数的数量。
 示例:
 输入: 10
 输出: 4
 解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 */

public class LeetCode204 {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }
        if (n == 3) {
            return 1;
        }
        int count = 1;
        // 都输
        for (int i = 3; i < n; i = i + 2) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    //判断是否为素数
    public boolean isPrime(int x) {
        // 循环每次+2
        for (int i = 3; i < Math.sqrt(x) + 1; i = i + 2) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LeetCode204 leet = new LeetCode204();
        int n = leet.countPrimes(10);
        System.out.println(n);
//        boolean b = leet.isPrime(6);
//        System.out.println(b);
    }
}
