package com.javapractice.hackerrank;

import java.util.*;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> stack = new ArrayDeque<>();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int type = in.nextInt();
            switch(type) {
                case 1:
                    int val = in.nextInt();
                    stack.push(Math.max(val, (stack.peek() == null) ? Integer.MIN_VALUE : stack.peek()));
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    System.out.println(stack.peek());
            }
        }
    }

}
