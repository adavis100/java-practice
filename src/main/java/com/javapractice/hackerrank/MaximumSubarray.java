package com.javapractice.hackerrank;

import java.util.Scanner;

public class MaximumSubarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int times = scanner.nextInt();
        for (int i = 0; i < times; i++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }
            System.out.println(findMaxContiguous(arr) + " " + findMaxNonContiguous(arr));
        }
    }

    private static int findMaxNonContiguous(int[] nums) {
        int result = 0;
        for (int n : nums) {
            if (n > 0) {
                result += n;
            }
        }

        if (result == 0) {
            result = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > result)
                    result = nums[i];
            }
        }

        return result;
    }

    private static int findMaxContiguous(int[] nums) {
        int current = nums[0];
        int max = current;
        for (int i = 1; i < nums.length; i++) {
            if (current > 0) {
                current += nums[i];
            } else {
                current = nums[i];
            }

            if (current >= max) {
                max = current;
            }
        }

        return max;
    }
}
