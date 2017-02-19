package com.javapractice.leetcode;

import org.testng.annotations.Test;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.testng.Assert.assertEquals;

public class WordLadderTest {
    @Test
    public void findsLadderLength() throws Exception {
        WordLadder ladder = new WordLadder();
        Set<String> wordList = Stream.of("hot", "dot", "dog", "lot", "log").collect(Collectors.toSet());
        assertEquals(ladder.ladderLength("hit", "cog", wordList), 5);
    }

    @Test(enabled = false) // TODO: fix
    public void handlesWordWithOneStep() throws Exception {
        WordLadder ladder = new WordLadder();
        assertEquals(ladder.ladderLength("hit", "him", null), 1);
    }
}
