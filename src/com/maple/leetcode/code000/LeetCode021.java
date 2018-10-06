package com.maple.leetcode.code000;
/*
将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
示例：
输入：1->2->4, 1->3->4
输出：1->1->2->3->4->4
*/

public class LeetCode021 {
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
        int[] nums1 = {1};
        int[] nums2 = {2};
        ListNode l1 = new ListNode(nums1);
        ListNode l2 = new ListNode(nums2);

        LeetCode021 leet = new LeetCode021();
        ListNode head = leet.mergeTwoLists(l1, l2);
        System.out.println(head);
    }

}
