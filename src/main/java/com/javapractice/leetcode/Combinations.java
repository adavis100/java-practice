package com.javapractice.leetcode;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Combinations {
    public List<List<Integer>> combinationSum3(int k, int n) {
        Set<List<Integer>> combinations = new HashSet<>();

        findCombinations(combinations, new int[k], 0, 0, 1, k, n);
        return new ArrayList<>(combinations);
    }

    private void findCombinations(Set<List<Integer>> combinations, int[] nums, int index, int count, int start, int k, int n) {
        if (index == k && count == n) {
            Arrays.sort(nums);
            List<Integer> result = IntStream.of(nums).boxed().collect(Collectors.toList());
            combinations.add(result);
        } else if (index < k && count < n) {
            for (int i = start; i < 10; i++) {
                nums[index] = i;
                findCombinations(combinations, nums, index+1, count + i, i + 1, k, n);
            }
        }
    }
}
