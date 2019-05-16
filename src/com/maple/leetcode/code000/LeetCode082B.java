package com.maple.leetcode.code000;

public class LeetCode082B {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;

        ListNode pre = dummyHead;
        ListNode cur = head;
        boolean isDuplicated = false;
        while (cur.next != null) {
            while (cur.next != null && cur.val == cur.next.val) {
                cur = cur.next;
            }
            pre.next = cur.next;
            cur = cur.next;
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        LeetCode082B leet = new LeetCode082B();
        int[] arr = {1, 1, 1};
        ListNode head = new ListNode(arr);
        System.out.println(head);
        ListNode r = leet.deleteDuplicates(head);
        System.out.println(r);
    }
}
