package com.javapractice.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    private Map<Integer, CacheNode> map;
    private CacheNode root;
    private CacheNode tail;
    private int capacity;
    private int size;

    public LRUCache(int capacity) {
        map = new HashMap<>();
        root = new CacheNode();
        tail = new CacheNode();
        root.next = tail;
        tail.prev = root;
        this.capacity = capacity;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            CacheNode node = map.get(key);
            node.prev.next = node.next;
            node.next.prev = node.prev;
            node.next = root.next;
            node.prev = root;
            root.next.prev = node;
            root.next = node;
            return node.val;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            CacheNode node = map.get(key);
            node.val = value;
            node.prev.next = node.next;
            node.next.prev = node.prev;
            node.next = root.next;
            node.prev = root;
            root.next.prev = node;
            root.next = node;
        } else {
            size++;
            if (size > capacity) {
                int remove = tail.prev.key;
                tail.prev.prev.next = tail;
                tail.prev = tail.prev.prev;
                map.remove(remove);
                size--;
            }
            CacheNode node = new CacheNode();
            node.key = key;
            node.val = value;
            node.prev = root;
            node.next = root.next;
            root.next.prev = node;
            root.next = node;
            map.put(key, node);
        }
    }

    static class CacheNode {
        int key;
        int val;
        CacheNode prev;
        CacheNode next;
    }
}
