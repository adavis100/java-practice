package com.javapractice.scratch;

import java.util.Random;

public class QuickSelect {
    private final Random random = new Random();

    public int findKthLargest(int[] nums, int k) {

        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int pivotIndex = partition(nums, l, r);
            if (pivotIndex == nums.length - k) {
                return nums[pivotIndex];
            } else if (pivotIndex < nums.length - k) {
                l = pivotIndex + 1;
            } else {
                r = pivotIndex - 1;
            }
        }
        return -1;
    }

    private int partition(int[] nums, int l, int r) {
        int pivot = choosePivot(l, r);
        swap(nums, pivot, r);
        int index = l;

        for (int i = l; i < r; i++) {
            if (nums[i] < nums[r]) {
                swap(nums, i, index++);
            }
        }
        swap(nums, index, r);

        return index;
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    private int choosePivot(int l, int r) {
        return random.nextInt(r - l + 1) + l;
    }
}
