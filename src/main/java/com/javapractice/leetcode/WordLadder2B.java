package com.javapractice.leetcode;

import java.util.*;

public class WordLadder2B {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        var queue = new ArrayDeque<List<String>>();
        var result = new ArrayList<List<String>>();
        var marker = new ArrayList<String>();

        var startList = new ArrayList<String>();
        startList.add(beginWord);
        queue.add(startList);
        queue.add(marker);
        while (queue.size() > 0) {
            var cur = queue.remove();

            if (cur == marker) {
                if (result.size() > 0) {
                    return result;
                }
                if (queue.size() > 0) {
                    queue.add(marker);
                }
                continue;
            }
            if (cur.get(cur.size() - 1).equals(endWord)) {
                result.add(cur);
            } else {
                queue.addAll(getAdjacent(cur, wordList));
            }
        }
        return List.of();
    }

    private List<List<String>> getAdjacent(List<String> list, List<String> wordList) {
        var neighbors = new ArrayList<List<String>>();
        var last = list.get(list.size() - 1);
        for (String word : wordList) {
            if (!list.contains(word) && areAdjacent(last, word)) {
                list.add(word);
                neighbors.add(new ArrayList<>(list));
                list.remove(list.size() - 1);
            }
        }
        return neighbors;
    }

    private boolean areAdjacent(String word1, String word2) {
        boolean diff = false;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i) && !diff) {
                diff = true;
            } else if (word1.charAt(i) != word2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
