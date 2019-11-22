package com.maple.leetcode.code000;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode061 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        int len = 0;
        ListNode p = head;
        ListNode last = new ListNode(-1);
        while (p != null) {
            len += 1;
            last = p;
            p = p.next;
        }

        k = k % len;
        if (k == 0) {
            return head;
        }

        p = head;
        int i = 0;

        Queue<ListNode> queue = new LinkedList<>();
        while (i < len - k) {
            ListNode temp = new ListNode(p.val);
            queue.add(temp);
            p = p.next;
            i++;
        }
        while (!queue.isEmpty()) {
            last.next = ((LinkedList<ListNode>) queue).pop();
            last = last.next;
        }
        return p;
    }

    public static void main(String[] args) {
        LeetCode061 leet = new LeetCode061();
        leet.rotateRight(new ListNode(new int[]{1, 2, 3, 4, 5}), 2);
    }
}
