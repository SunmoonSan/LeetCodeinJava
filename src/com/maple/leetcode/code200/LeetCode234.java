package com.maple.leetcode.code200;
/*
 * @desc : Created by San on 2019-05-02 23:39
 */

/*
请判断一个链表是否为回文链表。

示例 1:

输入: 1->2
输出: false
示例 2:

输入: 1->2->2->1
输出: true
进阶：
你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 */

import java.util.ArrayList;
import java.util.List;

public class LeetCode234 {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            if (list.get(left).equals(list.get(right))) {
                left++;
                right--;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        LeetCode234 leet = new LeetCode234();
        int[] array = {1, 2, 2, 1};
        ListNode head = new ListNode(array);
        boolean b = leet.isPalindrome(head);
        System.out.println(b);
    }
}
