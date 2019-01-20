package com.javapractice.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;


class TwitterTest {
    @Test
    @Disabled // Todo: Fix
    void canPostTweets()  {
        Twitter twitter = new Twitter();

        twitter.postTweet(1, 5);
        List<Integer> tweets = twitter.getNewsFeed(1);
        assertEquals(1, tweets.size());
        assertEquals(5, (int) tweets.get(0));
    }
}
