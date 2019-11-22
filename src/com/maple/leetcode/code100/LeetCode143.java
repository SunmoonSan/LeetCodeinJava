package com.maple.leetcode.code100;

public class LeetCode143 {
    public void reorderList(ListNode head) {
        ListNode prev = new ListNode(-1);
        prev.next = head;
        ListNode p = head;
        while (p.next != null) {
            p = p.next;
            prev.next = p;
        }
        head.next = p;
        prev.next = null;

        reorderList(head.next);
    }


}
