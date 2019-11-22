package com.maple.leetcode.code600;
/*
 * @desc : Created by San on 2019-05-03 19:27
 */

public class LeetCode622 {
    public static void main(String[] args) {
        MyCircularQueue queue = new MyCircularQueue(6);
        queue.enQueue(6);
        System.out.println(queue.Rear());
        System.out.println(queue.Rear());
    }
}

class MyCircularQueue {

    private int[] data;
    private int rear;
    private int head;

    /**
     * Initialize your data structure here. Set the size of the queue to be k.
     */
    public MyCircularQueue(int k) {
        data = new int[k+1];
        head = rear = data.length - 1;
    }

    /**
     * Insert an element into the circular queue. Return true if the operation is successful.
     */
    public boolean enQueue(int value) {
        if ((rear + 1) % data.length == head) {
            return false;
        }
        rear = (rear + 1) % data.length;
        data[rear] = value;
        return true;
    }

    /**
     * Delete an element from the circular queue. Return true if the operation is successful.
     */
    public boolean deQueue() {
        if (head == rear) {
            return false;
        }
        head = (head + 1) % data.length;
        return true;
    }

    /**
     * Get the front item from the queue.
     */
    public int Front() {
        return data[head];
    }

    /**
     * Get the last item from the queue.
     */
    public int Rear() {
        return data[rear];
    }

    /**
     * Checks whether the circular queue is empty or not.
     */
    public boolean isEmpty() {
        return head == rear;
    }

    /**
     * Checks whether the circular queue is full or not.
     */
    public boolean isFull() {
        return (rear + 1) % data.length == head;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("[");
        for (int i = 0; i < data.length; i++) {
            res.append(data[i]);
            if (i != data.length - 1) {
                res.append(", ");
            }
        }
        res.append("]");
        return res.toString();
    }
}
