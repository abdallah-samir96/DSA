package com.dsa.day6;

import java.util.UUID;

public class App {
    public static void main(String[] args) {
        String text = UUID.randomUUID().toString();
        System.out.println(text);
        System.out.println(text.length());
    }
}
