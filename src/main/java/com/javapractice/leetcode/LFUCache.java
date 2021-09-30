package com.javapractice.leetcode;

import java.time.Clock;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LFUCache {
    private PriorityQueue<Node> heap;
    private Map<Integer,Node> map;
    private int capacity;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.heap = new PriorityQueue<>();
        this.map = new HashMap<>();
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            heap.remove(node);
            node.incrementUses();
            heap.add(node);
            return node.value;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (map.size() + 1 > capacity) {
            Node lfuNode = heap.remove();
            map.remove(lfuNode.key);
        }
        Node node = new Node(key, value);
        map.put(key, node);
        heap.add(node);
    }

    static class Node implements Comparable<Node> {
        int key;
        int value;
        int useCount;
        long accessTime;
        Clock clock;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.useCount = 1;
            this.clock = Clock.systemUTC();
            this.accessTime = clock.millis();
        }

        void incrementUses() {
            useCount++;
            accessTime = clock.millis();
        }

        @Override
        public int compareTo(Node other) {
            if(this.useCount == other.useCount) {
                return this.accessTime > other.accessTime ? 1 : -1;
            } else {
                return this.useCount - other.useCount;
            }
        }
    }
}
