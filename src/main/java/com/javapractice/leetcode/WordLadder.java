package com.javapractice.leetcode;



import java.util.*;

public class WordLadder {
    public int ladderLength(String startWord, String endWord, Set<String> wordList) {
        Queue<String> queue = new LinkedList<>();
        Map<String, Integer> distMap = new HashMap<>();
        distMap.put(startWord, 1);
        queue.add(startWord);

        while (!queue.isEmpty()) {
            String current = queue.remove();
            if (oneStep(current, endWord)) {
                return distMap.get(current) + 1;
            }
            for(String word : wordList) {
                if (oneStep(current, word) && !distMap.containsKey(word)) {
                    distMap.put(word, distMap.get(current) + 1);
                    queue.add(word);
                }
            }
        }
        return 0;
    }

    private boolean oneStep(String startWord, String endWord) {
        if (startWord.length() != endWord.length())
            return false;
        int diffs = 0;
        for (int i = 0; i < startWord.length(); i++) {
            if (startWord.charAt(i) != endWord.charAt(i) && ++diffs > 1)
                return false;
        }
        return true;
    }
}
