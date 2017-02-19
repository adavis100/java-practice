package com.javapractice.leetcode;

import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;

public class TrieTest {
    @Test
    public void findsWordInTrie() throws Exception {
        Trie trie = new Trie();
        trie.insert("foo");
        assertTrue(trie.search("foo"));
    }

    @Test
    public void findsPrefixInTrie() throws Exception {
        Trie trie = new Trie();
        trie.insert("foobar");
        assertTrue(trie.startsWith("foo"));
    }
}
