package com.javapractice.hackerrank;

import java.util.Scanner;

public class AngryProfessor {
    public static boolean shouldCancel(int[] arrivalTimes, int minStudents)
    {
        int earlyStudents = 0;
        for (int arrivalTime : arrivalTimes)
        {
            if (arrivalTime <= 0)
            {
                earlyStudents++;
            }
        }
        return earlyStudents < minStudents;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++)
        {
            int totalStudents = scanner.nextInt();
            int minStudents = scanner.nextInt();
            int[] arrivalTimes = new int[totalStudents];
            for (int j = 0; j < totalStudents; j++)
            {
                arrivalTimes[j] = scanner.nextInt();
            }
            String output = shouldCancel(arrivalTimes, minStudents) ? "YES" : "NO";
            System.out.println(output);
        }
    }
}
