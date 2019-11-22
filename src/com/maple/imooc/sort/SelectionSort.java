package com.maple.imooc.sort;
/*
选择排序
 */

public class SelectionSort {

    public int[] selectionSort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }
            swap(data, i, minIndex);
        }
        return data;
    }

    private void swap(int[] data, int l, int r) {
        int t = data[l];
        data[l] = data[r];
        data[r] = t;
    }

    public static void main(String[] args) {
        SelectionSort sort = new SelectionSort();
        int[] data = {3, 2, 5, 1, 6, 0};
        data = sort.selectionSort(data);
        for (int datum : data) {
            System.out.print(datum + ", ");
        }
    }
}
