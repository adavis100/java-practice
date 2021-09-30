package com.javapractice.misc;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SegmentTreeTest {
    @Test
    void buildsSegmentTree() {
        int[] nums = new int[] {1,3,-2,8,-7};
        SegmentTree segmentTree = new SegmentTree(nums);

        assertThat(segmentTree.get(1)).isEqualTo(3);
    }

    @Test
    void getsSumOfEntireRange() {
        int[] nums = new int[] {1,3,-2,8,-7};
        SegmentTree segmentTree = new SegmentTree(nums);

        assertThat(segmentTree.sum(0, 4)).isEqualTo(3);
    }

    @Test
    void getsLeafSum() {
        int[] nums = new int[] {1,3,-2,8,-7};
        SegmentTree segmentTree = new SegmentTree(nums);

        assertThat(segmentTree.sum(4, 4)).isEqualTo(-7);
    }

    @Test
    void getsIntermediateSum() {
        int[] nums = new int[] {1,3,-2,8,-7};
        SegmentTree segmentTree = new SegmentTree(nums);

        assertThat(segmentTree.sum(1, 3)).isEqualTo(9);
    }
}