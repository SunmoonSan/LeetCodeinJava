package com.maple.leetcode.code700;
/*
 * @desc : Created by San on 2019-05-03 23:56
 */

public class LeetCode707 {

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtIndex(-1, 0);
        System.out.println(linkedList.get(0));
        System.out.println(linkedList);
    }
}

class MyLinkedList {

    private ListNode dummyHead;
    private int size;

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }

        @Override
        public String toString() {
            return val + "";
        }
    }

    /**
     * Initialize your data structure here.
     */
    public MyLinkedList() {
        dummyHead = new ListNode(-1);
        size = 0;
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        if (size<=0) {
            return -1;
        }

        if (index < 0 || index >= size) {
            return -1;
        }
        ListNode p = dummyHead.next;
        for (int i = 0; i < index; i++) {
            p = p.next;
        }
        return p.val;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        ListNode head = new ListNode(val);
        head.next = dummyHead.next;
        dummyHead.next = head;
        size++;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        ListNode p = dummyHead;
        while (p.next != null) {
            p = p.next;
        }
        p.next = new ListNode(val);
        size++;
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        if (index<0) {
            index = 0;
        }
        ListNode pre = dummyHead;
        ListNode cur = pre.next;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
            cur = cur.next;
        }

        pre.next = new ListNode(val);
        pre.next.next = cur;
        size++;
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        ListNode pre = dummyHead;
        ListNode cur = pre.next;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
            cur = cur.next;
        }

        pre.next = pre.next.next;
        size--;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        ListNode p = dummyHead.next;
        for (int i = 0; i < size; i++) {
            res.append(p.val).append("->");
            p = p.next;
        }
        res.append("null");
        return res.toString();
    }
}
