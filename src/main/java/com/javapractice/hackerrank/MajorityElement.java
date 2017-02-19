package com.javapractice.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int find(int[] nums) {
        Map<Integer,Integer> countMap = new HashMap<>();

        for(int n : nums) {
            if(!countMap.containsKey(n)) {
                countMap.put(n, 1);
            } else {
                int count = countMap.get(n) + 1;
                countMap.put(n, count);
            }

            if(countMap.get(n) > nums.length/2) {
                return n;
            }
        }
        return Integer.MAX_VALUE;
    }
}
