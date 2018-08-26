package com.maple.leetcode.code200;
/*
删除链表中等于给定值 val 的所有节点。
示例:
输入: 1->2->6->3->4->5->6, val = 6
输出: 1->2->3->4->5
*/

public class LeetCode203 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;

        ListNode p = dummyHead;
        while (p.next != null) {
            if (p.next.val == val) {
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }

        return dummyHead.next;
    }
}
