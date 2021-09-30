package com.javapractice.misc;

public class HashTable<K,V> {
    private final Entry<K,V>[] table;
    private static final int TABLE_SIZE = 128;

    @SuppressWarnings("unchecked")
    public HashTable() {
        table = (Entry<K,V>[]) new Entry[TABLE_SIZE];
    }

    public void put(K key, V val) {
        int bin = hash(key) % table.length;
        if (table[bin] == null) {
            table[bin] = new Entry<>(key, val);
        } else {
            Entry<K,V> entry = table[bin];
            while (!entry.getKey().equals(key) && entry.next != null) {
                entry = entry.next;
            }

            if (entry.getKey().equals(key)) {
                entry.setVal(val);
            } else {
                entry.next = new Entry<>(key, val);
            }
        }
    }

    private int hash(K key) {
        return key.hashCode();
    }

    public V get(K key) {
        int bin = hash(key) % table.length;
        Entry<K,V> entry = table[bin];
        while(entry != null && !entry.getKey().equals(key)) {
            entry = entry.next;
        }
        if (entry != null && entry.getKey().equals(key)) {
            return entry.getVal();
        } else {
            return null;
        }
    }

    static class Entry<K, V> {
        private final K key;
        private V val;
        private Entry<K,V> next;

        Entry(K key, V val) {
            this.key = key;
            this.val = val;
        }

        K getKey() {
            return key;
        }

        V getVal() {
            return val;
        }

        public void setVal(V val) {
            this.val = val;
        }
    }
}
