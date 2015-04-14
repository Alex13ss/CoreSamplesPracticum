package ua.natl.map.lrucache;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

@SuppressWarnings("serial")
public class SimpleLRUCache<K, V> extends LinkedHashMap<K, V> {

    private final int capacity;

    public SimpleLRUCache(int capacity) {
        super(capacity + 1, 1.1f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Entry<K, V> eldest) {
        return this.size() > capacity;
    }

}
