package com.maple.leetcode.code300;
/*
 * @desc : Created by San on 2020/9/19 07:36
 */
/*
用一个 非空 单链表来表示一个非负整数，然后将这个整数加一。
你可以假设这个整数除了 0 本身，没有任何前导的 0。
这个整数的各个数位按照 高位在链表头部、低位在链表尾部 的顺序排列。

示例:
输入: [1,2,3]
输出: [1,2,4]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/plus-one-linked-list
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class LeetCode369 {
    public ListNode plusOne(ListNode head) {
        ListNode list1 = reverseList(head);
        ListNode p1 = list1;
        while (p1 != null) {
            p1.val = p1.val + 1;
            if (p1.val > 9) {
                p1.val -= 10;
                if (p1.next == null) {
                    p1.next = new ListNode(1);
                    break;
                }
            } else {
                break;
            }
            p1 = p1.next;
        }
        return reverseList(list1);
    }

    private ListNode reverseList(ListNode head) {
        ListNode p1 = null;
        ListNode p2 = head;
        ListNode p3 = p2.next;
        while (p3 != null) {
            p2.next = p1;
            p1 = p2;
            p2 = p3;
            p3 = p3.next;
        }
        p2.next = p1;
        return p2;
    }

    public static void main(String[] args) {
        LeetCode369 leet = new LeetCode369();
        int[] arr = {9, 9, 9};
        ListNode head = new ListNode(arr);
        leet.plusOne(head);
    }
}
