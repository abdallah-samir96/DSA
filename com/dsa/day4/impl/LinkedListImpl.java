package com.dsa.day4.impl;

import java.io.Serializable;

public class LinkedListImpl <E> implements Serializable {

    private final Node<E> head;
    private int size;

    private static class Node<E>{
        private E data;
        private Node<E> next;
    }

    public LinkedListImpl(){
        this.head = new Node<>();
        this.head.data = null;
        this.head.next = null;
    }

    public void add(E data) {
        Node<E> node = new Node<>();
        node.data = data;
        node.next = null;
        if (head.next == null) {
            this.head.next = node;
            size++;
            return;
        }
        Node<E> pointer = head.next;
        while(pointer.next != null) {
            pointer = pointer.next;
        }
        pointer.next = node;
        size ++;
    }

    public void printList() {
        Node<E> pointer = this.head.next;
        while(pointer != null) {
            System.out.println(pointer.data + ", ");
            pointer = pointer.next;
        }
    }
    public int size() {
        return size;
    }

}
