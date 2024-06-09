package com.dsa.day3;

import com.dsa.day3.impl.QueueImpl;

public class Main {
    public static void main(String[] args) {
        QueueImpl<String> queue = new QueueImpl<>();
        queue.enqueue("Abdallah");
        queue.enqueue("Hello");
        queue.enqueue("Hello");
        queue.enqueue("Hello");
        queue.enqueue("Hello World!!");
        System.out.println(queue.dequeue());
        System.out.println(queue.getCurrentSize());
        System.out.println(queue.isFull());
        queue.showElements();
    }
}