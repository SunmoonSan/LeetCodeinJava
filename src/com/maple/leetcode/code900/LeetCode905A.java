package com.maple.leetcode.code900;

public class LeetCode905A {
    public int[] sortArrayByParity(int[] A) {
        int l = 0;  // 左索引
        int r = A.length - 1; //右索引
        while (l < r) {
            if (A[l] % 2 == 0 && A[r] % 2 == 0) { // 左偶,右偶
                l++; // 左索引右移
            } else if (A[l] % 2 == 0 && A[r] % 2 != 0) { // 左偶,右奇
                l++; // 左索引右移
                r--; // 右索引左移
            } else if (A[l] % 2 != 0 && A[r] % 2 == 0) { // 左奇,右偶
                // 交换左右索引处的数
                int t = A[l];
                A[l] = A[r];
                A[r] = t;

                // 交换后, 左索引右移,右索引左移
                l++;
                r--;
            } else { // 左奇,右奇
                r--; // 右索引左移
            }
        }
        return A;
    }

    public static void main(String[] args) {
        LeetCode905A leet = new LeetCode905A();
        int[] a = {3, 1, 2, 4};
        leet.sortArrayByParity(a);
    }
}
