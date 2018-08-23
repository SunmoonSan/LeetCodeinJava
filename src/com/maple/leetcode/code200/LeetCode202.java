package com.maple.leetcode.code200;
/*
编写一个算法来判断一个数是不是“快乐数”。
一个“快乐数”定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是无限循环但始终变不到 1。如果可以变为 1，那么这个数就是快乐数。
示例:
输入: 19
输出: true
解释:
1*1 + 9*9 = 82
8*8 + 2*2 = 68
6*6 + 8*8 = 100
1*1 + 0*0 + 0*0 = 1
*/

import java.util.HashSet;
import java.util.Set;

public class LeetCode202 {
    public boolean isHappy(int n) {

        if (n < 1) {
            return false;
        }

        Set<Integer> set = new HashSet<>();

        while (true) {
            int total = 0;  // 计算一次分解后的和

            while (n > 0) {
                int r = n % 10;
                total += r * r;
                n = n / 10;
            }

            // 分解后和为1,则返回true
            if (total == 1) {
                return true;
            }

            // 不等于1时,查找集合中是否存在,若存在则会死循环,必然不是快乐数
            if (set.contains(total)) {
                return false;
            } else {
                set.add(total);
                n = total;
            }
        }

    }

    public static void main(String[] args) {
        LeetCode202 leet = new LeetCode202();
        boolean b = leet.isHappy(19);
        System.out.println(b);
    }
}
