package com.maple.leetcode.code100;
/*
在 O(n log n) 时间复杂度和常数级空间复杂度下，对链表进行排序。

示例 1:
输入: 4->2->1->3
输出: 1->2->3->4

示例 2:
输入: -1->5->3->4->0
输出: -1->0->3->4->5
*/

import java.util.Arrays;

public class LeetCode148 {
    public ListNode sortList(ListNode head) {
        // 构造虚拟头结点
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;

        ListNode p = dummyHead;

        // 计算链表len长度
        int len = 0;
        while (p.next != null) {
            len++;
            p = p.next;
        }

        // 构造长度为len的数组
        int[] nums = new int[len];

        // 将链表的元素依次存入nums数组
        p = dummyHead;
        int index = 0;
        while (p.next != null) {
            nums[index] = p.next.val;
            index++;
            p = p.next;
        }

        Arrays.sort(nums); // 对nums数组进行排序

        // 将排序后的数组依次存入链表
        p = dummyHead;
        index = 0;
        while (p.next != null) {
            p.next.val = nums[index];
            index++;
            p = p.next;
        }

        return dummyHead.next;
    }

    public static void main(String[] args) {
        LeetCode148 leet = new LeetCode148();

//        int[] nums = {4, 2, 1, 3};
        int[] nums = {-1, 5, 3, 4, 0};
        ListNode head = leet.sortList(new ListNode(nums));
        System.out.println(head);
    }
}
