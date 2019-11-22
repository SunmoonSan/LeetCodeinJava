package com.maple.imooc.sort;

public class BubbleSort {

    public int[] bubbleSort(int[] data) {
        for (int i = data.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (data[j] > data[j + 1]) {
                    int t = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = t;
                }
            }
        }

        return data;
    }

    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        int[] data = {3, 5, 2, 6, 7, 1};
        data = sort.bubbleSort(data);
        for (int n : data) {
            System.out.print(n + ", ");
        }
    }
}
