package com.maple.leetcode.codeH00;

public class LeetCode1721 {
    public static void main(String[] args) {
        LeetCode1721 leet = new LeetCode1721();
        int[] arr = {1, 2, 3, 4, 5};
        ListNode head = new ListNode(arr);
        leet.swapNodes(head, 2);
    }

    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < k - 1; i++) {
            fast = fast.next;
        }
        ListNode nodeA = fast;

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        ListNode nodeB = slow;
        int t = nodeA.val;
        nodeA.val = nodeB.val;
        nodeB.val = t;
        return head;
    }
}
