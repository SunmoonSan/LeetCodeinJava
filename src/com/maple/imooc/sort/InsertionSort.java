package com.maple.imooc.sort;
/*
插入排序
 */

public class InsertionSort {

    public int[] insertionSort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int t = data[i];
            int j = i;
            while (j > 0 && t < data[j - 1]) {
                data[j] = data[j - 1];
                j--;
            }
            data[j] = t;
        }

        return data;
    }

    public static void main(String[] args) {
        InsertionSort sort = new InsertionSort();
        int[] data = {3, 2, 6, 4, 9, 1};
        data = sort.insertionSort(data);
        for (int n : data) {
            System.out.print(n + ", ");
        }
    }
}
