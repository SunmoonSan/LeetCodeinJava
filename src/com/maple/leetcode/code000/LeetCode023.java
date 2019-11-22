package com.maple.leetcode.code000;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class LeetCode023 {
    public ListNode mergeKLists(ListNode[] lists) {
        int index = 0;
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                lists[index] = lists[i];
                index++;
            }
        }

        if (lists.length == 0) {
            return null;
        }

        if (lists.length == 1) {
            return lists[0];
        }

        if (lists.length == 2) {
            return mergeTwoLists(lists[0], lists[1]);
        }

        ListNode head = null;
        for (int i = 0; i < lists.length - 1; i++) {
            head = mergeTwoLists(lists[i], lists[i + 1]);
        }

        return head;
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        // l1为空时, 直接返回l2
        if (l1 == null) {
            return l2;
        }

        // l2为空时, 直接返回l1
        if (l2 == null) {
            return l1;
        }

        // 为l1构造虚拟头结点
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = l1;

        ListNode p = dummyHead; // 比较用的指针

        while (l2 != null) {
            ListNode delNode = l2;  // l2的头结点,待移除
            l2 = l2.next; // l2舍弃头结点,后移一位

            // 寻找delNode要添加的位置
            while (p.next.val < delNode.val) {
                p = p.next;
                // p指向l1尾节点,直接将l2剩余部分追加l1上
                if (p.next == null) {
                    p.next = delNode; // 此时delNode仍指向链表2的头结点,而l2去指向链表2的第2个节点.故而返回delNode.
                    return dummyHead.next;
                }
            }

            // l2中移除的节点添加到l1上
            delNode.next = p.next;
            p.next = delNode;
            p = p.next; // 指针后移一位
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        ListNode[][] listNodes = {{}, {}, {}};

        System.out.println(listNodes);

        LeetCode023 leet = new LeetCode023();
//        ListNode head = leet.mergeKLists(();
//        System.out.println(head);
    }
}
