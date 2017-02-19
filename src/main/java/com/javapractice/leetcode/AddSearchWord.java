package com.javapractice.leetcode;

/**
 *
 * Design a data structure that supports the following two operations:
 * void addWord(word)
 * bool search(word)
 * search(word) can search a literal word or a regular expression string containing only letters a-z or .. A . means it can represent any one letter.
 *
 * For example:
 *
 * addWord("bad")
 * addWord("dad")
 * addWord("mad")
 * search("pad") -> false
 * search("bad") -> true
 * search(".ad") -> true
 * search("b..") -> true
 *
 * Note:
 * You may assume that all words are consist of lowercase letters a-z
 */
public class AddSearchWord {
    private Node root;

    public AddSearchWord() {
        root = new Node();
    }

    public void addWord(String word) {

    }

    public boolean search(String word) {
        return doSearch(word, root);
//        Node node = root;
//        for (char c : word.toCharArray()) {
//            if (c == '.') {
//
//            } else {
//
//            }
//        }
//        return false;
    }

    private boolean doSearch(String word, Node node) {
        if (word.isEmpty()) {
            return node.isWord;
        } else {
            char first = word.charAt(0);
            String rest = word.substring(1);
            if (first == '.') {
                for (int i = 0; i < 26; i++) {
                    if (node.edges[i] != null && doSearch(rest, node.edges[i])) {
                        return true;
                    }
                }
                return false;
            } else {
                return node.edges[first - 'a'] != null && doSearch(rest, node.edges[first - 'a']);
            }
        }
    }
}

class Node {
    Node[] edges;
    boolean isWord;

    public Node() {
        edges = new Node[26];
        isWord = false;
    }
}
