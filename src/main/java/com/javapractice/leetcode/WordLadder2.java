package com.javapractice.leetcode;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordLadder2 {
    public List<List<String>> findLadders(String startWord, String endWord, Set<String> wordList) {
        List<List<String>> frontier = new LinkedList<>();
        List<List<String>> ladders = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        frontier.add(Stream.of(startWord).collect(Collectors.toList()));
        visited.add(startWord);
        wordList.add(endWord);
        boolean found = false;

        while (!frontier.isEmpty() && !found) {
            List<List<String>> next = new LinkedList<>();

            for (List<String> path : frontier) {
                for (String nextWord : getNeighbors(path.get(path.size() - 1), wordList)) {
                    //if (!visited.contains(nextWord)) {
                    //    visited.add(nextWord);
                        List<String> nextPath = path.stream().collect(Collectors.toList());
                        nextPath.add(nextWord);
                        next.add(nextPath);
                    //}

                    if (nextWord.equals(endWord)) {
                        List<String> ladder = path.stream().collect(Collectors.toList());
                        ladder.add(nextWord);
                        ladders.add(ladder);
                        found = true;
                    }
                }
            }
            frontier = next;
        }
        return ladders;
    }


    private List<String> getNeighbors(String s, Set<String> wordList) {
        List<String> neighbors = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char[] word = s.toCharArray();
            for (char c='a'; c < 'z'; c++) {
                word[i] = c;
                String toCheck = new String(word);
                if (!toCheck.equals(s) && wordList.contains(toCheck))
                    neighbors.add(toCheck);
            }
        }
        return neighbors;
    }
}
