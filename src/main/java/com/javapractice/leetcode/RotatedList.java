package com.javapractice.leetcode;

public class RotatedList {
    public int search(int[] nums, int target) {
//        return searchHelper(nums, 0, nums.length, target);
        int start = 0;
        int end = nums.length;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[start] < nums[mid]) {
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[end - 1]) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
            }
        }
        return -1;
    }

    private int searchHelper(int[] nums, int start, int end, int target) {
        if (start >= end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[start] < nums[mid]) { // left half sorted
            if (target >= nums[start] && target <= nums[mid - 1]) { // target in left half
                return searchHelper(nums, start, mid, target); // search left half
            } else {
                return searchHelper(nums, mid + 1, end, target);
            }
        } else { // right half sorted
            if (mid + 1 < end && target >= nums[mid + 1] && target <= nums[end - 1]) { // target in right half
                return searchHelper(nums, mid + 1, end, target); // search right half
            } else {
                return searchHelper(nums, start, mid, target); // search left half
            }
        }
    }

    public int searchTwoPass(int[] nums, int target) {
        if (nums.length == 0 || (nums.length == 1 && target != nums[0])) {
            return -1;
        } else if (nums.length == 1) {
            return 0;
        }

        int pivot = findPivot(nums, 0, nums.length);
        if (inRange(nums, 0, pivot, target)) {
            return doSearch(nums, 0, pivot, target);
        } else if (inRange(nums, pivot, nums.length, target)) {
            return doSearch(nums, pivot, nums.length, target);
        }
        return -1;
    }

    private boolean inRange(int[] nums, int start, int end, int target) {
        return end > 0 && target >= nums[start] && target <= nums[end - 1];
    }

    private int doSearch(int[] nums, int start, int end, int target) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (target == nums[mid]) {
            return mid;
        } else if (target < nums[mid]) {
            return doSearch(nums, start, mid - 1, target);
        } else {
            return doSearch(nums, mid + 1, end, target);
        }
    }

    int findPivot(int[] nums, int start, int end) {
        int mid = start + (end - start) / 2;
        if (end - start < 2 || nums[start] < nums[end - 1]) {
            return start;
        } else if (nums[mid] < nums[mid - 1]) {
            return mid;
        }

        if (leftSorted(nums, start, mid)) {
            return findPivot(nums, mid + 1, end);
        } else {
            return findPivot(nums, start, mid);
        }
    }

    private boolean leftSorted(int [] nums, int start, int end) {
        if (start >= end) {
            return true;
        }
        return nums[end] > nums[start];
    }
}
