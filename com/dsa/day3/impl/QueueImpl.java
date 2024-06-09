package com.dsa.day3.impl;

import java.io.Serializable;

public class QueueImpl <T> implements Serializable {
    private final Object[] queue;
    private int currentSize;
    private int tail;

    public QueueImpl() {
        this(10);
    }
    public QueueImpl(int capacity) {
        this.queue = new Object[capacity];
        this.tail = -1;
    }

    public void enqueue(T data) {
        if(isFull()) {
            throw new RuntimeException("could not enqueue as the queue is full");
        }
        this.tail ++;
        this.queue[this.tail] = data;
        this.currentSize ++;
    }
    @SuppressWarnings("unchecked")
    public T dequeue() {
        if(isEmpty()) {
            throw new RuntimeException("could not dequeue as the queue is Empty!");
        }
        T element = (T)this.queue[0];
        shiftElements();
        this.currentSize --;
        return element;
    }
    /**
     * Used to shift the elements
     * The Circular queue not need to shift the elements
     * */
    private void shiftElements() {
        for(int i = 0; i < tail; i++){
            this.queue[i] = this.queue[i+1];
        }
        // remove the value, the tail refer to.
        this.queue[tail] = null;
        this.tail --;
    }

    public boolean isFull() {
        return this.currentSize == queue.length;
    }
    public boolean isEmpty() {
        return this.currentSize == 0;
    }

    public void showElements() {
        for (int i = 0; i <= tail; i++) {
            if(i != tail)
                System.out.print(queue[i] + ",");
            else
                System.out.print(queue[i]);
        }
    }
    public int getCurrentSize () {
        return this.currentSize;
    }
}
