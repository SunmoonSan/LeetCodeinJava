package com.maple.leetcode.code000;

public class LeetCode019B {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode l = dummyHead;
        ListNode r = dummyHead;
        for (int i = 0; i < n; i++) {
            r = r.next;
        }

        while (r.next != null) {
            l = l.next;
            r = r.next;
        }

        l.next = l.next.next;
        return dummyHead.next;
    }

    public static void main(String[] args) {
        LeetCode019B leet = new LeetCode019B();
        int[] arr = {1, 2, 3, 4, 5};
        ListNode head = new ListNode(arr);
        System.out.println(head);
        leet.removeNthFromEnd(head, 2);
        System.out.println(head);
    }
}
