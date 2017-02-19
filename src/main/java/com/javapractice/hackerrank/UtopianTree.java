package com.javapractice.hackerrank;

import java.util.Scanner;

public class UtopianTree {
    private static int heightAfter(int cycles) {
        int height = 1;
        boolean spring = true;
        for (int i = 0; i < cycles; i++) {
            if(spring) {
                height *= 2;
                spring = false;
            }
            else {
                height++;
                spring = true;
            }
        }
        return height;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int cycles;
        for (int i = 0; i < t; i++) {
            cycles = sc.nextInt();
            System.out.println(heightAfter(cycles));
        }
    }
}
