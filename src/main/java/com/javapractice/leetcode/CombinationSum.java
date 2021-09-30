package com.javapractice.leetcode;

import java.util.*;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        var combinations = new HashSet<List<Integer>>();
        findCombinations(candidates, target, new ArrayList<Integer>(), combinations);
        return new ArrayList<>(combinations);
    }

    private void findCombinations(int[] candidates, int need, List<Integer> list, Set<List<Integer>> combinations) {
        if (need == 0) {
            var found = new ArrayList<>(list);
            Collections.sort(found);
            combinations.add(found);
        } else if (need > 0) {
            for (int candidate : candidates) {
                list.add(candidate);
                findCombinations(candidates, need - candidate, list, combinations);
                list.remove(list.size() - 1);
            }
        }
    }
}
