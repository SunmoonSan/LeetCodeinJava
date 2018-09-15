package com.maple.leetcode.code000;

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
