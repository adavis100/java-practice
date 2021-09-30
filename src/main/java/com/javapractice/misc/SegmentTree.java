package com.javapractice.misc;

public class SegmentTree {
    private final int[] tree;
    private final int n;

    public SegmentTree(int[] nums) {
        n = nums.length;
        tree = new int[n * 4];
        build(nums, 1, 0, n - 1);
    }

    private void build(int[] nums, int index, int l, int r) {
        if (l == r) {
            tree[index] = nums[l];
        } else {
            int mid = l + (r - l) / 2;
            build(nums, 2 * index, l, mid);
            build(nums, 2 * index + 1, mid + 1, r);
            tree[index] = tree[2 * index] + tree[2 * index + 1];
        }
    }

    public int get(int index) {
        return tree[index];
    }

    public int sum(int l, int r) {
        return doSum(1, 0, n - 1, l, r);
    }

    private int doSum(int index, int lBound, int rBound, int l, int r) {
        if (l > r) {
            return 0;
        }
        if (l == lBound && r == rBound) {
            return tree[index];
        }
        int mid = lBound + (rBound - lBound) / 2;
        return doSum(2 * index, lBound, mid, l, Math.min(mid, r)) +
                doSum(2 * index + 1, mid + 1, rBound, Math.max(mid + 1, l), r);
    }
}
