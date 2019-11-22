package com.maple.leetcode.code900;

public class LeetCode922 {
    public int[] sortArrayByParityII(int[] A) {
        for (int i = 0; i < A.length; i++) {
            int j = i + 1;
            if (i % 2 == 0 && A[i] % 2 != 0) {
                while (j < A.length) {
                    if (A[j] % 2 == 0) {
                        swap(A, i, j);
                        break;
                    } else {
                        j++;
                    }
                }
            } else if (i % 2 != 0 && A[i] % 2 == 0) {
                while (j < A.length) {
                    if (A[j] % 2 != 0) {
                        swap(A, i, j);
                        break;
                    } else {
                        j++;
                    }
                }
            }
        }
        return A;
    }

    private void swap(int[] A, int i, int j) {
        int t = A[i];
        A[i] = A[j];
        A[j] = t;
    }

    public static void main(String[] args) {
        LeetCode922 leet = new LeetCode922();
        int[] a = {2, 3, 1, 1, 4, 0, 0, 4, 3, 3};
        leet.sortArrayByParityII(a);
    }
}
