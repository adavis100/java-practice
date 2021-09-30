package com.javapractice.leetcode;

public class TrapRainWater {
    public int trap(int[] height) {
        int l = 0;
        int r = 0;
        int total = 0;
        while (l < height.length) {
            r = l + 1;
            while (r < height.length && height[r] < height[l]) {
                r++;
            }

            int cur = l + 1;
            while (r < height.length && cur < r) {
                int border = Math.min(height[l], height[r]);
                total += (border - height[cur]);
                cur++;
            }
            l = r;
        }
        return total;
    }
}
