package com.javapractice.leetcode;


import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TrieTest {
    @Test
    void findsWordInTrie()  {
        Trie trie = new Trie();
        trie.insert("foo");
        assertTrue(trie.search("foo"));
    }

    @Test
    void findsPrefixInTrie()  {
        Trie trie = new Trie();
        trie.insert("foobar");
        assertTrue(trie.startsWith("foo"));
    }
}
