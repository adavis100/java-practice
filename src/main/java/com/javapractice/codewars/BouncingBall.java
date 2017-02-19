package com.javapractice.codewars;

public class BouncingBall {
    public static int bouncingBall(double h, double bounce, double window) {
        if (h <= 0 || bounce <= 0 || bounce >= 1.0 || window >= h)
            return -1;

        int result = 1;
        double current = h * bounce;
        while (current >= window) {
            current *= bounce;
            result += 2;
        }
        return result;
    }
}
