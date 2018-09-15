package com.maple.leetcode.code700;

import java.util.ArrayList;
import java.util.List;

public class LeetCode728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isDividingNumber(i)) {
                list.add(i);
            }
        }

        return list;
    }

    /*
    判断一个数是否是自除数
     */
    public boolean isDividingNumber(int n) {
        int tempN = n;
        int temp;
        // 从低位到高位, 逐个用n取余
        while (tempN >= 10) {
            temp = tempN % 10;
            if (temp == 0) {
                return false;
            } else if (n % temp != 0) {
                return false;
            }
            tempN = (tempN - temp) / 10;
        }

        // 判断最高位的数字
        if (n % tempN != 0) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        LeetCode728 leet = new LeetCode728();
        System.out.println(leet.selfDividingNumbers(1, 22));
    }
}
