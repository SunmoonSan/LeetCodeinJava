package com.maple.leetcode.code100;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public ListNode(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array can not be empty!");
        }

        this.val = array[0];
        ListNode current = this;
        for (int i = 1; i < array.length; i++) {
            current.next = new ListNode(array[i]);
            current = current.next;
        }
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        ListNode current = this;
        while (current != null) {
            res.append(current.val).append("->");
            current = current.next;
        }
        res.append("null");

        return res.toString();
    }
}
