package com.zizitop.course.data.structures;

import com.zizitop.course.data.MyKeyValue;

public class HashTable<K,V> implements MyKeyValue<K,V> {

    private DynamicArrayList<Entry> dynamicArray;

    public HashTable() {
        dynamicArray = new DynamicArrayList<>();
    }

    @Override
    public void put(K key, V value) {
        int hash = key.hashCode();
        int idx = hash % dynamicArray.length();

        Entry existed = dynamicArray.get(idx); //collision
        Entry newEntry = new Entry(key, value);
        if(existed!=null){
            existed.next = newEntry;
        } else {
            dynamicArray.add(idx, newEntry);
        }
    }

    @Override
    public V get(K key) {
        int hash = key.hashCode();
        int idx = hash % dynamicArray.length();
        return null;
    }

    @Override
    public V remove(K key) {
        return null;
    }
}
