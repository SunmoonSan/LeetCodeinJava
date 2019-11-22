package com.maple.imooc.sort;
/*
快速排序
 */

public class QuickSort {

    public void quickSort(int[] data) {
        quickSort(data, 0, data.length - 1);
    }

    private void quickSort(int[] data, int l, int r) {
        if (l >= r) {
            return;
        }

        int p = partition(data, l, r);
        quickSort(data, l, p - 1);
        quickSort(data, p + 1, r);
    }

    private int partition(int[] data, int l, int r) {
        while (l < r) {
            while (l < r && data[l] < data[r]) {
                r--;
            }
            swap(data, l, r);

            while (l < r && data[l] < data[r]) {
                l++;
            }
            swap(data, l, r);
        }

        return l;
    }

    private void swap(int[] data, int l, int r) {
        int t = data[l];
        data[l] = data[r];
        data[r] = t;
    }

    public static void main(String[] args) {
        QuickSort sort = new QuickSort();
        int[] data = {3, 1, 5, 4, 7, 9, 2};
        sort.quickSort(data);
        for (int n : data) {
            System.out.print(n + "  ");
        }
    }
}
