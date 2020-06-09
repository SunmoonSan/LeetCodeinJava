package com.maple.leetcode.codelcci;
/*
 * @desc : Created by San on 2020-04-14 19:32
 */

import java.util.HashSet;
import java.util.Set;

public class LCCI0201 {
    public ListNode removeDuplicateNodes(ListNode head) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode p = dummyHead;
        Set<Integer> set = new HashSet<>();
        while (p.next != null) {
            if (set.contains(p.next.val)) {
                p.next = p.next.next;
            } else {
                set.add(p.next.val);
                p = p.next;
            }
        }

        return dummyHead.next;
    }

    public static void main(String[] args) {
        LCCI0201 lcci = new LCCI0201();
        int[] nodes = {1, 1, 1, 1, 2};
        lcci.removeDuplicateNodes(new ListNode(nodes));
    }
}
