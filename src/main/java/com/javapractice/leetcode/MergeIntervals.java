package com.javapractice.leetcode;

import java.util.Arrays;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        int cur = 0;
        Arrays.sort(intervals, (i1, i2) -> {
            if (i1[0] == i2[0]) {
                return i1[1] - i2[1];
            } else {
                return i1[0] - i2[0];
            }
        });

        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] <= intervals[cur][1] && intervals[i][1] >= intervals[cur][1]) {
                intervals[cur][1] = intervals[i][1];
            } else if (intervals[i][1] > intervals[cur][0]) {
                cur++;
                intervals[cur][0] = intervals[i][0];
                intervals[cur][1] = intervals[i][1];
            }
        }
        int[][] merged = new int[cur+1][2];
        for(int i = 0; i <= cur; i++) {
            merged[i][0] = intervals[i][0];
            merged[i][1] = intervals[i][1];
        }
        return merged;
    }
}
