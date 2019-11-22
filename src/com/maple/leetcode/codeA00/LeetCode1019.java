package com.maple.leetcode.codeA00;

import java.util.*;

public class LeetCode1019 {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode p = head;
        while (p!= null) {
            list.add(p.val);
            p = p.next;
        }
        int[] biggers = new int[list.size()];

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < list.size(); i++) {
            while (!stack.isEmpty() && list.get(i)>list.get(stack.peek())) {
                int top = stack.pop();
                biggers[top] = list.get(i);
            }
            stack.push(i);
        }

        return biggers;
    }

    public static void main(String[] args) {
        LeetCode1019 leet = new LeetCode1019();
        int[] arr = {2, 7, 4, 3, 5};
        ListNode head = new ListNode(arr);
        System.out.println(head);
        leet.nextLargerNodes(head);
    }
}
