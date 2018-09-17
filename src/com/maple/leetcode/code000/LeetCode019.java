package com.maple.leetcode.code000;
/*
给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。

示例：
给定一个链表: 1->2->3->4->5, 和 n = 2.
当删除了倒数第二个节点后，链表变为 1->2->3->5.

说明：
给定的 n 保证是有效的。

进阶：
你能尝试使用一趟扫描实现吗？
*/

public class LeetCode019 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head==null) {
            return null;
        }

        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;  // 虚拟头结点指向head

        int len =0;  // 链表长度
        ListNode p = dummyHead;
        while (p.next!=null) {
            len++;
            p = p.next;
        }

        p = dummyHead;
        for (int i=0;i<len-n;i++) {
            p = p.next;
        }  // p指向待删除节点的前一个节点

        p.next = p.next.next;  // 跳过待删除的节点,直接指向下一个节点

        return dummyHead.next;
    }
}
