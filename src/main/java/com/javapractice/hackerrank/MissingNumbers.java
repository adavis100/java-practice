package com.javapractice.hackerrank;

import java.util.*;

public class MissingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        int m = sc.nextInt();
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            b.add(sc.nextInt());
        }

        Set<Integer> missing = findMissing(a, b);
        StringBuilder sb = new StringBuilder();
        for(int num : missing) {
            sb.append(num);
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());
    }

    private static Set<Integer> findMissing(List<Integer> a, List<Integer> b) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Set<Integer> missing = new TreeSet<>();
        for (int n : a) {
           if(map.containsKey(n)) {
               map.put(n, map.get(n) + 1);
           }
           else {
               map.put(n, 1);
           }
        }

        for (int n : b) {
            if(!map.containsKey(n)) {
                missing.add(n);
            }
            else {
                int count = map.get(n) - 1;
                if(count < 0) {
                    missing.add(n);
                }
                map.put(n, count);
            }
        }
        return missing;
    }
}
