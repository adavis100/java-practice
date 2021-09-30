package com.javapractice.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LRUCache2 {
    private final int capacity;
    private Map<Integer,Node> map;
    private Node head;
    private Node tail;
    private int size;

    public LRUCache2(int capacity) {
        this.capacity = capacity;
        map = new HashMap<Integer,Node>();
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
        size = 0;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            moveToFront(node);
            return node.val;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.val = value;
            moveToFront(node);
        } else {
            if (size == capacity) {
                evictLru();
                size--;
            }
            size++;
            Node node = new Node(key, value);
            addToFront(node);
            map.put(key, node);
        }
    }

    private void moveToFront(Node node) {
        if (node.prev == head) {
            return;
        }
        node.next.prev = node.prev;
        node.prev.next = node.next;
        addToFront(node);
    }

    private void addToFront(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    private void evictLru() {
        Node node = tail.prev;
        tail.prev = node.prev;
        node.prev.next = tail;
        map.remove(node.key);
    }

    private static class Node {
        int key;
        int val;
        Node next;
        Node prev;

        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }

        Node() {

        }
    }
}
