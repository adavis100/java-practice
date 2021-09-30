package com.javapractice.misc;

public class TowersOfHanoi {
    private static void move(int n, char from, char to, char other) {
        if (n == 1) {
            System.out.println("Moving disk " + n + " from " + from + " to " + to);
            return;
        }
        move(n - 1, from, other, to);
        System.out.println("Moving disk " + n + " from " + from + " to " + to);
        move(n - 1, other, to, from);
    }

    public static void main(String[] args) {
        move(3, 'A', 'B', 'C');
    }
}
