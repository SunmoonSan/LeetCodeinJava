package com.maple.leetcode.code000;
/*
给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
示例:
给定 1->2->3->4, 你应该返回 2->1->4->3.

说明:
  你的算法只能使用常数的额外空间。
  你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
*/

public class LeetCode024 {
    public ListNode swapPairs(ListNode head) {

        // 如head为空[],直接返回空[]
        if (head == null) {
            return null;
        }

        ListNode p = head;  // 指向头节点
        while (p.next != null) {
            // 相邻两元素,交换val值
            int t = p.val;
            p.val = p.next.val;
            p.next.val = t;

            p = p.next.next; // p指向下下个节点
            if (p == null) { // 下下个节点为空, 直接返回head
                return head;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        LeetCode024 leet = new LeetCode024();
        ListNode head = leet.swapPairs(new ListNode(nums));
        System.out.println(head);
    }
}
