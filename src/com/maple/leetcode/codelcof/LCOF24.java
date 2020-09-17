package com.maple.leetcode.codelcof;
/*
定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
示例:

输入: 1->2->3->4->5->NULL
输出: 5->4->3->2->1->NULL
 
限制：
0 <= 节点个数 <= 5000
 */

public class LCOF24 {
    public static void main(String[] args) {
        LCOF24 lcof = new LCOF24();
        int[] arr = {1, 2, 3, 4, 5};
        ListNode h = new ListNode(arr);
        ListNode node = lcof.reverseList(h);
        System.out.println(node);
    }

    public ListNode reverseList(ListNode head) {
        return reverseList(null, head);
    }

    private ListNode reverseList(ListNode h1, ListNode h2) {
        if (h2 == null) {
            return h1;
        }
        ListNode p1 = h2;
        ListNode p2 = p1.next;

        p1.next = h1;
        return reverseList(p1, p2);
    }
}
