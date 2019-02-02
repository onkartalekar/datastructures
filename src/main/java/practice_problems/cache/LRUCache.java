package practice_problems.cache;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class LRUCache {

    private int capacity;
    private Map<Integer, Integer> cache;
    private LinkedList<Integer> usage;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>(capacity, 1);
        usage = new LinkedList<>();
    }

    public int get(int key) {
        Integer value = cache.get(key);
        if (value == null) {
            return -1;
        } else {
            updateUsage(key);
            return value;
        }
    }

    private void updateUsage(int key) {
        if (usage.contains(key)) {
            usage.removeFirstOccurrence(key);
        }
        usage.push(key);
    }

    public void put(int key, int value) {
        if (this.cache.size() >= this.capacity && !cache.containsKey(key)) {
            int lruKey = usage.getLast();
            cache.remove(lruKey);
            usage.removeFirstOccurrence(lruKey);
        }
        cache.put(key, value);
        updateUsage(key);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */