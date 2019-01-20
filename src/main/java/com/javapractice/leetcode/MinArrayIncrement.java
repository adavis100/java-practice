package com.javapractice.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers A, a move consists of choosing any A[i], and incrementing it by 1.
 *
 * Return the least number of moves to make every value in A unique.
 */
class MinArrayIncrement {
    int minIncrementForUnique(int[] array) {
        Set<Integer> vals = new HashSet<>();
        int moves = 0;
        for(int num: array) {
           while (vals.contains(num)) {
               moves++;
               num++;
           }
           vals.add(num);
        }
        return moves;
    }
}
