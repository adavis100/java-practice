package com.javapractice.misc;

import java.util.HashSet;
import java.util.Set;

public class ContinuousSubarraySum {
    public int continuousSubarrays(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        if (nums.length == 0) {
            return 0;
        }

        int sum = 0;
        set.add(0);
        for (int num : nums) {
            sum += num;
            set.add(sum);
        }

        int count = 0;
        sum = 0;
        for (int num : nums) {
            sum += num;
            int target = sum - k;
            if (set.contains(target)) {
                count++;
            }
        }
        return count;
    }
}
