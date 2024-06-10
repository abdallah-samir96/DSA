package com.dsa.day4;

import com.dsa.day4.impl.LinkedListImpl;

import java.util.LinkedList;

public class App {
    public static void main(String[] args) {

        LinkedListImpl<String> linkedList = new LinkedListImpl<>();
        linkedList.add("Abdallah");
        linkedList.add("Ahmed");
        linkedList.add("Mohamed");
        linkedList.add("Mohamed");
        linkedList.add("Mohamed");
        linkedList.add("Mohamed");
        linkedList.add("Mohamed");
        System.out.println("Size of list is " + linkedList.size());
        linkedList.printList();

        //checkLinkedList();
    }

    private static void checkLinkedList() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Abdallah");
        list.add("Mohamed");
        // will get the first Item in the list
        System.out.println(list.peek());
        System.out.println(list);

    }
}
