package com.javapractice.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReorderList {
    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public void reorderList(ListNode head) {
        ListNode cur = head;
        Deque<ListNode> stack = new ArrayDeque<>();

        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }

        // 1 2 3 --> 1
        cur = head;
        for (int i = 0; i < count; i++) {
            if (i >= count / 2) {
                stack.push(cur);
            }
            cur = cur.next;
        }

        cur = head;
        while (stack.size() > 0) {
            ListNode next = stack.remove();

            if (cur.next == next) {
                next.next = null;
            } else {
                ListNode tmp = cur.next;
                cur.next = next;
                next.next = tmp;
                cur = tmp;
            }
        }
        if (count % 2 != 0) {
            cur.next = null;
        }
    }
}
