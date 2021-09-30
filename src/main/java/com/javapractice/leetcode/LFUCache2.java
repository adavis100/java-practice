package com.javapractice.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LFUCache2 {
    private final Map<Integer, Node> map;
    private final Map<Integer, LinkedList<Node>> freqMap;
    private int minFreq;
    private final int capacity;

    public LFUCache2(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.freqMap = new HashMap<>();
        this.minFreq = 0;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            incrementFrequency(node);
            return node.val;
        } else  {
            return -1;
        }
    }

    private void incrementFrequency(Node node) {
        LinkedList<Node> freqList = freqMap.get(node.freq);
        freqList.remove(node);
        if (freqList.isEmpty()) {
            freqMap.remove(node.freq);
            if (node.freq == minFreq) {
                minFreq++;
            }
        }
        node.freq++;
        LinkedList<Node> nextFreqList = freqMap.getOrDefault(node.freq, new LinkedList<>());
        nextFreqList.add(0, node);
        freqMap.put(node.freq, nextFreqList);
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.val = value;
            incrementFrequency(node);
        } else {
            if (map.size() == capacity) {
                LinkedList<Node> minFreqList = freqMap.get(minFreq);
                Node evict = minFreqList.removeLast();
                map.remove(evict.key);
            }
            Node node = new Node(key, value);
            map.put(key, node);
            addNodeToMinFreqList(node);
        }
    }

    private void addNodeToMinFreqList(Node node) {
        LinkedList<Node> freqList = freqMap.getOrDefault(1, new LinkedList<>());
        freqList.add(0, node);
        freqMap.put(1, freqList);
        minFreq = 1;
    }

    static class Node {
        int key;
        int val;
        int freq;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
            this.freq = 1;
        }
    }
}
