package com.javapractice.leetcode;

class TrieNode {
    TrieNode[] edge;
    boolean isWord;

    public TrieNode() {
        edge = new TrieNode[26];
        isWord = false;
    }
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        doInsert(word, root);
    }

    private void doInsert(String word, TrieNode node) {
        if (word.isEmpty()) {
            node.isWord = true;
        } else {
            char first = word.charAt(0);
            String rest = word.substring(1);
            if (node.edge[first - 'a'] == null) {
                node.edge[first - 'a'] = new TrieNode();
            }
            doInsert(rest, node.edge[first - 'a']);
        }
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            if (node.edge[c - 'a'] != null) {
                node = node.edge[c - 'a'];
            } else {
                return false;
            }
        }
        return node.isWord;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (char c : prefix.toCharArray()) {
            if (node.edge[c - 'a'] != null) {
                node = node.edge[c - 'a'];
            } else {
                return false;
            }
        }
        return true;
    }
}

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");
