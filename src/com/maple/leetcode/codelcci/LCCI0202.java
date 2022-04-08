package com.maple.leetcode.codelcci;

import java.util.Stack;

public class LCCI0202 {
    public static void main(String[] args) {
        LCCI0202 lcci = new LCCI0202();
        ListNode node = new ListNode(new int[]{1, 2, 3, 4, 5});
        int n = lcci.kthToLast(node, 2);
        System.out.println(n);
    }

    public int kthToLast(ListNode head, int k) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }

        while (k > 1) {
            stack.pop();
            k--;
        }
        return stack.pop();
    }
}
