package com.company.algorithm.fundamental;

import java.util.Iterator;

public class Stack<Item> implements Iterable<Item> {

    Stack();
    void push(Item item);
    Item pop();
    boolean isEmpty();
    int size();

    @Override
    public Iterator<Item> iterator() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
