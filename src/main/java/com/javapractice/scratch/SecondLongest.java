package com.javapractice.scratch;

import java.util.*;

public class SecondLongest {
    List<String> solution1(List<String> words) {
        int longest = 0;
        int second = 0;
        List<String> secondList = new ArrayList<>();
        for (String word : words) {
            System.out.println(word);
            if (word.length() > longest) {
                second = longest;
                longest = word.length();
            } else if (word.length() < longest && word.length() > second) {
                second = word.length();
            }
        }
        for (String word : words) {
            if (word.length() == second) {
                secondList.add(word);
            }
        }
        return secondList;
    }

    List<String> solution2(List<String> words) {
        TreeMap<Integer, List<String>> wordMap = new TreeMap<>(Collections.reverseOrder());
        for (String word : words) {
            List<String> curWords = new ArrayList<>();
            if (wordMap.containsKey(word.length())) {
                curWords = wordMap.get(word.length());
            }
            curWords.add(word);
            wordMap.put(word.length(), curWords);
        }
        return wordMap.entrySet().stream().skip(1).map(Map.Entry::getValue).findFirst().orElse(List.of());
    }

    Set<String> solution3(List<String> words) {
        Map<Integer, Set<String>> map = new TreeMap<>(Comparator.reverseOrder());

        for (String word : words) {
            var length = word.length();
            var set = map.getOrDefault(length, new HashSet<>());
            set.add(word);
            map.put(length, set);
        }
        return map.entrySet().stream()
                .skip(1)
                .map(Map.Entry::getValue)
                .findFirst()
                .orElse(Set.of());
    }
}
