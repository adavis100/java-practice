package com.javapractice.hackerrank;

import java.util.Scanner;

public class Candies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] ratings = new int[n];
        for (int i = 0; i < n; i++) {
            ratings[i] = scanner.nextInt();
        }
        System.out.println(findMinimumCandies(ratings));
    }

    private static int findMinimumCandies(int[] ratings) {
        int prev = (ratings.length > 1 && ratings[0] > ratings[1]) ? 2 : 1;
        int count = prev;

        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i-1] < ratings[i]) {
                prev++;
            } else if (ratings[i-1] > ratings[i]) {
                prev = 1;
            } else {
                prev = (prev > 1) ? 1 : prev;
            }
            count += prev;
        }
        return count;
    }
}
