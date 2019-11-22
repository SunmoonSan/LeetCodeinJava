package com.maple.test;

import java.util.Arrays;

public class Test {

    public void dfs(int[] arr, int l, int r) {
        if (l == r) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }
            System.out.println();
        }

        for (int i = l; i <= r; i++) {
            swap(arr, l, i);
            dfs(arr, l + 1, r);
            swap(arr, l, i);
        }
    }

    private void swap(int[] arr, int l, int r) {
        int t = arr[l];
        arr[l] = arr[r];
        arr[r] = t;
    }

    public static void main(String[] args) {
        Test test = new Test();
        int[] arr = {1, 2, 3};
        test.dfs(arr, 0, arr.length-1);
    }
}
