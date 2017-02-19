package com.javapractice.hackerrank;

import java.util.Scanner;

public class CountingSort1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] vals = new int[n];
        for (int i = 0; i < n; i++) {
            vals[i] = scanner.nextInt();
        }
        int[] counts = countOccurrences(vals);
        printCounts(counts);
    }

    private static void printCounts(int[] counts) {
        for (int count : counts) {
            System.out.print(count + " ");
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
