package com.maple.leetcode.code000;
/*
给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中没有重复出现的数字。
示例 1:
输入: 1->2->3->3->4->4->5
输出: 1->2->5

示例 2:
输入: 1->1->1->2->3
输出: 2->3
*/

import java.util.HashSet;
import java.util.Set;

public class LeetCode082A {
    public ListNode deleteDuplicates(ListNode head) {

        // 若head为空,直接返回空
        if (head == null) {
            return null;
        }

        ListNode p1 = head;
        Set<Integer> set = new HashSet<>();
        // 遍历一遍,节点去重,并且将重复的元素保存到集合set
        while (p1.next != null) {
            if (p1.val == p1.next.val) {
                set.add(p1.val);
                p1.next = p1.next.next;
            } else {
                p1 = p1.next;
            }
        }

        // 为去重后的链表构造虚拟头结点
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;

        ListNode p2 = dummyHead;
        // 遍历,逐个判断当前节点是否存在set里,若存在,则舍弃.
        while (p2.next != null) {
            if (set.contains(p2.next.val)) {
                p2.next = p2.next.next;
            } else {
                p2 = p2.next;
            }
        }


        return dummyHead.next;
    }

    public static void main(String[] args) {
        LeetCode082A leet = new LeetCode082A();
        int[] nums = {1, 1, 1, 2, 3};
        ListNode head = leet.deleteDuplicates(new ListNode(nums));
        System.out.println(head);
    }
}
