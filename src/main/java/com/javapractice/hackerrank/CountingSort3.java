package com.javapractice.hackerrank;

import java.util.Scanner;

public class CountingSort3 {


    private static int[] nums;
    private static String[] words;
    private static String[] results;

    public static void main(String[] args) {
        readInput();
        int[] counts = countOccurrences();
        getStartingIndexes(counts);
        fillResults(counts);
        printResults();
    }

    private static void fillResults(int[] counts) {
        results = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length/2)
                results[counts[nums[i]]++] = "-";
            else
                results[counts[nums[i]]++] = words[i];
        }
    }

    private static void getStartingIndexes(int[] counts) {
        int totalCount = 0;
        for (int i = 0; i < counts.length; i++) {
            int index = totalCount;
            if (counts[i] > 0) {
                totalCount += counts[i];
            }
            counts[i] = index;
        }
    }

    private static void readInput() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        nums = new int[n];
        words = new String[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
            words[i] = scanner.next();
        }
    }

    private static void printResults() {
        StringBuilder sb = new StringBuilder();
        for (String s : results) {
            sb.append(s);
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }


    private static int[] countOccurrences() {
        int[] counts = new int[100];
        for(int num : nums)
            counts[num]++;
        return counts;
    }
}
