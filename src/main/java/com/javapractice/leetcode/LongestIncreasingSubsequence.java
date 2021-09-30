package com.javapractice.leetcode;

public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int longest = 0;


        for (int i = 0; i < nums.length; i++) {
            int lower = findLower(nums, i, nums[i]);
            dp[i] = lower == Integer.MIN_VALUE ? 1 : dp[lower] + 1;

            if (dp[i] > longest) {
                longest = dp[i];
            }
        }
        return longest;
    }


    // 1 2 4 7 9] --> 5. [ 1 4 7]
    private int findLower(int[] arr, int n, int target) {
        int start = 0;
        int end = n;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= target && mid - 1 >= 0 && arr[mid - 1] < target) {
                return mid - 1;
            } else if (arr[mid] < target && mid < end) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return Integer.MIN_VALUE;
    }
}
