package com.maple.leetcode.code200;

public class LeetCode237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
