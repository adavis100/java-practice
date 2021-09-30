package com.javapractice.leetcode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array. The result should also be sorted in ascending order.
 * <p>
 * An integer a is closer to x than an integer b if:
 * <p>
 * |a - x| < |b - x|, or
 * |a - x| == |b - x| and a < b
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: arr = [1,2,3,4,5], k = 4, x = 3
 * Output: [1,2,3,4]
 * Example 2:
 * <p>
 * Input: arr = [1,2,3,4,5], k = 4, x = -1
 * Output: [1,2,3,4]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= k <= arr.length
 * 1 <= arr.length <= 104
 * arr is sorted in ascending order.
 * -104 <= arr[i], x <= 104
 */
public class ClosestK {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        if (arr.length < k) {
            return Arrays.stream(arr).boxed().collect(Collectors.toList());
        }
        List<Integer> list = new ArrayList<>();

        int l = binSearch(arr, x) - 1;
        int r = l + 1;

        while (l >= 0 && r < arr.length && r - l - 1 < k) {
            if (Math.abs(arr[l] - x) < Math.abs(arr[r] - x)) {
                l--;
            } else {
                r++;
            }
        }

        if (r - l - 1< k && l >= 0) {
            while (r - l - 1 < k) {
                l--;
            }
        } else if (r - l < k && r < arr.length) {
            r++;
        }
        for (int i = l + 1; i < r; i++) {
            list.add(arr[i]);
        }
        return list;
    }

    private int binSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length;

        int i = 0;
        while (start <= end && start >= 0 && end <= arr.length) {
            i = start + (end - start) / 2;
            if (arr[i] > target) {
                end = i - 1;
            } else if (arr[i] < target) {
                start = i + 1;
            } else {
                return i;
            }

        }
        return i;
    }
}
