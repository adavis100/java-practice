package com.javapractice.leetcode;

import java.util.HashMap;

public class KSum {

    public int[] twoSum(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (map.containsKey(need) && map.get(need) != i) {
                result[0] = i;
                result[0] = map.get(need);
                break;
            }
        }
        return result;
    }
}
