package com.maple.leetcode.code200;
/*
反转一个单链表。
示例:
输入: 1->2->3->4->5->NULL
输出: 5->4->3->2->1->NULL
进阶:
你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
*/

public class LeetCode206A {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode head2 = null;  // 指向链表2的头指针
        while (head != null) {
            ListNode node = head;  // node指向链表1头结点
            head = head.next;

            node.next = head2;  // 链表1的头结点链接到链表2上
            head2 = node;  // 链表2头结点前移以为
        }

        return head2;
    }
}
