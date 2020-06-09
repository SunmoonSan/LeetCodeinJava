package com.maple.leetcode.codelcof;
/*
 * @desc : Created by San on 2020-06-03 16:49
 */

import java.util.Stack;

public class LCOF22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        Stack<ListNode> stack = new Stack<>();
        ListNode p = head;
        while (p != null) {
            stack.push(p);
            p = p.next;
        }
        ListNode node = new ListNode(-1);
        while (!stack.isEmpty()) {
            if (k > 0) {
                node = stack.pop();
            } else {
                break;
            }
            k--;
        }
        return node;
    }

    public static void main(String[] args) {
        LCOF22 lcof = new LCOF22();
        ListNode node = new ListNode(new int[]{1, 2, 3, 4, 5});
        lcof.getKthFromEnd(node, 2);
    }
}
