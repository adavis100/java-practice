package com.javapractice.hackerrank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AddedIntegers {
    public static List<Integer> findAddedIntegers(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set = new HashSet<Integer>();
        List<Integer> resultList = new ArrayList<Integer>();
        for (int n : list2) {
            set.add(n);
        }

        for (int n : list1) {
            if(!set.contains(n))
                resultList.add(n);
        }
        return resultList;
    }
}
