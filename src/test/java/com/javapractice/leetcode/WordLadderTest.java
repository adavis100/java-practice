package com.javapractice.leetcode;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class WordLadderTest {
    @Test
    void findsLadderLength()  {
        WordLadder ladder = new WordLadder();
        Set<String> wordList = Stream.of("hot", "dot", "dog", "lot", "log").collect(Collectors.toSet());
        assertEquals(5, ladder.ladderLength("hit", "cog", wordList));
    }

    @Test
    @Disabled // TODO: fix
    void handlesWordWithOneStep()  {
        WordLadder ladder = new WordLadder();
        assertEquals(1, ladder.ladderLength("hit", "him", null));
    }
}
