package com.javapractice.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CutSticks {
    public static List<Integer> doCut(List<Integer> sticks) {
        if(sticks == null || sticks.size() == 0) {
            return new ArrayList<Integer>();
        }

        // find smallest element
        int smallest = 1000;
        for (int stick : sticks) {
            if (stick < smallest) {
                smallest = stick;
            }
        }

        List<Integer> newList = new ArrayList<>();
        for (int stick : sticks) {
            int newVal = stick - smallest;
            if(newVal > 0) {
                newList.add(newVal);
            }
        }

        return newList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> sticks = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sticks.add(scanner.nextInt());
        }

        while(sticks.size() != 0) {
            System.out.println(sticks.size());
            sticks = doCut(sticks);
        }
    }
}
