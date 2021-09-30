package com.javapractice.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import com.javapractice.leetcode.ReorderList.ListNode;

class ReorderListTest {
    @Test
    void reordersList() {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));

        ReorderList reorder = new ReorderList();

        reorder.reorderList(node);
        assertThat(node.next.val).isEqualTo(3);
    }
}