package com.javapractice.leetcode;

import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class TwitterTest {
    @Test(enabled = false) // TODO: fix
    public void canPostTweets() throws Exception {
        Twitter twitter = new Twitter();

        twitter.postTweet(1, 5);
        List<Integer> tweets = twitter.getNewsFeed(1);
        assertEquals(tweets.size(), 1);
        assertEquals((int) tweets.get(0), 5);
    }
}
