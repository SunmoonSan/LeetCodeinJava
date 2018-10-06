package com.maple.leetcode.code000;
/*
给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。
将两数相加返回一个新的链表。
你可以假设除了数字 0 之外，这两个数字都不会以零开头。

示例：
输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
输出：7 -> 0 -> 8
原因：342 + 465 = 807
*/


import java.util.LinkedList;
import java.util.Queue;

public class LeetCode002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 初始化一个队列
        Queue<Integer> queue = new LinkedList<>();

        ListNode p1 = l1; // l1的指针
        ListNode p2 = l2; // l2的指针

        boolean over = false; // 两数和满10标志
        while (p1 != null && p2 != null) {
            int sum = p1.val + p2.val; // 两数和
            if (over) { // over为true,上一位和满10,则和加1
                sum = sum + 1;
            }

            // 本位和满10,则-9后入队, 不满10,则直接入队
            if (sum > 9) {
                over = true;
                queue.add(sum - 10);
            } else {
                over = false;
                queue.add(sum);
            }

            p1 = p1.next;
            p2 = p2.next;

            // l1比l2短,则依次为l1构造0节点
            if (p1 == null && p2 != null) {
                p1 = new ListNode(0);
            }

            // l2比l1短,则依次为l2构造0节点
            if (p1 != null && p2 == null) {
                p2 = new ListNode(0);
            }
        }

        // 最后以为相加满10, 则再入队一个1,如[5],[5]
        if (over) {
            queue.add(1);
        }

        // 构造一个包含虚拟头结点的链表
        ListNode dummyHead = new ListNode(-1);

        // 依次从队列中取出数值,插入链表
        ListNode p = dummyHead;
        while (!queue.isEmpty()) {
            p.next = new ListNode(queue.remove());
            p = p.next;
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        LeetCode002 leet = new LeetCode002();
        int[] nums1 = {1, 8};
        int[] nums2 = {0};
        ListNode head = leet.addTwoNumbers(new ListNode(nums1), new ListNode(nums2));
        System.out.println(head);
    }
}
