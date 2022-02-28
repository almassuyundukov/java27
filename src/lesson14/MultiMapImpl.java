package lesson14;

import java.util.*;
import java.util.function.BiFunction;

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
    public V remove(Object key) {
        if(multiMap.containsKey(key)){
            return (V) multiMap.remove(key);
        } else{
            return null;
        }

    }

    // возвращает true если входящий ключ содержится в обьекте multimap в другом случае возвращается false
    @Override
    public boolean containsKey(Object key) {
        return multiMap.containsKey(key);
    }


    // Удаляет значение value из ключа key, если такой ключ и значение имеется, то удаляется и возвращается true, в противном случае false
    @Override
    public boolean remove(Object key, Object value) {
        if (multiMap.containsKey(key) && multiMap.get(key).contains(value)) {
            multiMap.get(key).remove(value);
            return true;
        } else
                return false;
    }

//    @Override
//    public Set<Entry<K, V>> entrySet() {
//        Entry<K,V> map = null;
//        for(K key: multiMap.keySet()){
//            for(int i = 0; i < multiMap.get(key).size(); i++){
//                map.setValue(multiMap.get(key).get(i)).;
//            }
//        }
//        Set <Entry<K, V>> es;
//        es.add(map);
//        return true;
//    }

    // возвращает коллекцию ключей
    @Override
    public Set<K> keySet() {
        return multiMap.keySet();
    }

    // если multimap пустой то возвращает true, в другой случае false
    @Override
    public boolean isEmpty() {
        return multiMap.isEmpty();
    }

    // возвращает длину у multimap
    @Override
    public int size() {
        return multiMap.size();
    }


    // возвращает true если указанный ключ содержится и false в ином случае
    @Override
    public boolean containsValue(Object value) {
        for(K key: multiMap.keySet()){
            if(multiMap.get(key).contains(value)){
                return true;
            }
        }
        return false;
    }

    // заменяет последнее значение у ключа
    @Override
    public V replace(K key, V value) {
        if(multiMap.get(key) == null){
            return null;
        }
        multiMap.get(key).remove(multiMap.get(key).size() - 1);
        multiMap.get(key).add(value);
        return value;
    }

    // Заменяет значение у ключа на новый
    @Override
    public boolean replace(K key, V oldValue, V newValue) {
        if(multiMap.get(key) == null){
            return false;
        }
        if(multiMap.get(key).contains(oldValue)){
            multiMap.get(key).remove(oldValue);
            multiMap.get(key).add(newValue);
            return true;
        }
        return false;
    }



    @Override
    public String toString() {

        return multiMap.toString();
    }


}
