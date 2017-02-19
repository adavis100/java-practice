package com.javapractice.hackerrank;

import java.util.Scanner;

public class ChocolateFeast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        for (int i = 0; i < lines; i++) {
            int dollars = sc.nextInt();
            int cost = sc.nextInt();
            int wrappers = sc.nextInt();

            int purchased = dollars / cost;
            int availableWrappers = purchased;
            int bonus = 0;
            while(availableWrappers >= wrappers) {
                int currentBonus = availableWrappers / wrappers;
                int remaining = availableWrappers % wrappers;
                availableWrappers = currentBonus + remaining;
                bonus += currentBonus;
            }
            System.out.println(purchased + bonus);
        }
    }
}
