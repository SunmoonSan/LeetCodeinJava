package com.maple.leetcode.code800;

public class LeetCode852 {
    public int peakIndexInMountainArray(int[] A) {
        for (int i=0;i<A.length;i++) {
            if (A[i]>A[i+1]) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        LeetCode852 leet = new LeetCode852();
//        int[] a = {0, 1, 0};
        int[] a = {0,2,1,0};
        int index = leet.peakIndexInMountainArray(a);
        System.out.println(index);
    }
}
