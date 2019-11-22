package com.maple.imooc.heap;

public class MaxHeap {

    private int[] data;
    private int size;

    MaxHeap() {
        this.data = new int[10];
        size = 0;
    }

    private MaxHeap(int[] data) {
        this.data = data;
        size = data.length;
        heapify();
    }

    private int parent(int k) {
        return (k - 1) / 2;
    }

    private void heapify() {
        int k = size / 2 - 1;
        while (k >= 0) {
            siftDown(k);
            k--;
        }
    }

    private void siftUp(int k) {
        while (k > 0 && this.data[parent(k)] < this.data[k]) {
            swap(this.data, k, parent(k));
            k = parent(k);
        }
    }

    private void siftDown(int k) {
        int curPos = k;
        int childPos = k * 2 + 1;
        while (childPos < size) {
            int rightPos = childPos + 1;

            if (rightPos < size && this.data[childPos] < this.data[rightPos]) {
                childPos = rightPos;
            }

            if (this.data[curPos] < this.data[childPos]) {
                swap(this.data, curPos, childPos);
            }
            curPos = childPos;
            childPos = 2 * curPos + 1;
        }
    }

    private void swap(int[] data, int l, int r) {
        int t = data[l];
        data[l] = data[r];
        data[r] = t;
    }


    public static void main(String[] args) {
        int[] data = {4, 3, 1, 5, 7, 9, 2, 8};
        MaxHeap heap = new MaxHeap(data);
        for (int n : data) {
            System.out.print(n + "  ");
        }
    }
}
