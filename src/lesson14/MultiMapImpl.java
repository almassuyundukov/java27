package lesson14;

import java.util.*;

public class MultiMapImpl<K, V> extends HashMap<K, V> implements MultiMap<K, V> {
    private HashMap<K, List<V>> multiMap = new HashMap<>();


    @Override
    public int countValues(K key) {
        if (multiMap.get(key) == null) {
            return 0;
        }
        return multiMap.get(key).size();
    }

    @Override
    public V put(K key, V value) {
        if (multiMap.containsKey(key)) {
            List<V> values = multiMap.get(key);
            values.add(value);
            multiMap.put(key, values);
        } else {
            List<V> values = new LinkedList<>();
            values.add(value);
            this.multiMap.put(key, values);
        }
        return value;
    }


    @Override
    public Iterator<V> valuesIterator(K key) {
        if (multiMap.containsKey(key)) {
            return multiMap.get(key).iterator();
        } else {
            return null;
        }
    }

    @Override
    public Collection<V> values() {
        LinkedList<V> values = new LinkedList<>();
        for (K key : multiMap.keySet()) {
            List<V> valuesFromKey = multiMap.get(key);
            values.addAll(valuesFromKey);
        }
        return values;
    }

    @Override
    public V get(Object key) {
        if (multiMap.containsKey(key)) {
            return multiMap.get(key).get(multiMap.get(key).size() - 1);
        } else {
            return null;
        }
    }

    @Override
    public void clear() {
        multiMap.clear();
    }

    @Override
    public String toString() {
        return multiMap.toString();
    }
}
