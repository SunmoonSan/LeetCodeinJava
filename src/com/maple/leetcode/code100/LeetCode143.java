package com.maple.leetcode.code100;
/*
给定一个单链表 L：L0→L1→…→Ln-1→Ln ，
将其重新排列后变为： L0→Ln→L1→Ln-1→L2→Ln-2→…
你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。

示例 1:
给定链表 1->2->3->4, 重新排列为 1->4->2->3.
示例 2:
给定链表 1->2->3->4->5, 重新排列为 1->5->2->4->3.
 */

public class LeetCode143 {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }

        ListNode p1 = head;
        ListNode p2 = p1.next;

        ListNode p = p2;
        while (p.next.next != null) {
            p = p.next;
        }

        p1.next = p.next;
        p.next.next = p2;
        p.next = null;

        reorderList(p2);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        ListNode head = new ListNode(arr);
        System.out.println(head);
        LeetCode143 leet = new LeetCode143();
        leet.reorderList(head);
        System.out.println(head);
    }

}
