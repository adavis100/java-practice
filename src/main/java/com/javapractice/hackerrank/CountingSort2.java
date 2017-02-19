package com.javapractice.hackerrank;

import java.util.Scanner;

public class CountingSort2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] vals = new int[n];
        for (int i = 0; i < n; i++) {
            vals[i] = scanner.nextInt();
        }
        int[] counts = countOccurrences(vals);
        printSorted(counts);
    }

    private static void printSorted(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                for (int j = 0; j < counts[i]; j++) {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println("");
    }

    private static int[] countOccurrences(int[] nums) {
        int[] counts = new int[100];
        for(int num : nums)
            counts[num]++;
        return counts;
    }
}
