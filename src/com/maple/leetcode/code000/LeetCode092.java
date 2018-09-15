package com.maple.leetcode.code000;

public class LeetCode092 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode frontHead = null;
        ListNode tailHead = null;
        ListNode centerHead = null;
        ListNode centerTail = null;

        frontHead = head;
        for (int i = 1; i < m - 1; i++) {
            frontHead = frontHead.next;
        }
        centerHead = frontHead.next;

        tailHead = head;
        centerTail = tailHead;
        for (int i = 0; i < n; i++) {
            centerTail = tailHead;
            tailHead = tailHead.next;
        }
        centerTail.next = null;

        while (centerHead != null) {
            ListNode temp = centerHead;
            centerHead = centerHead.next;
            temp.next = tailHead;
            tailHead = temp;
        }

        frontHead.next = tailHead;

        return frontHead;
    }
}
