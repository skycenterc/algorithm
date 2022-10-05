package com.company.algorithm.fundamental;

import java.util.Iterator;

public class Queue<Item> implements Iterable<Item> {
    Queue();
    void enqueue(Item item);
    Item dequeue(Item item);
    boolean isEmpty();
    int size();

    @Override
    public Iterator<Item> iterator() {
        // TODO Auto-generated method stub
        return null;
    }
}
