package com.dsa.day1;

public class App {
    public static void main(String[] args) {
        checkSize();
    }

    private static void checkSize() {
        byte s = 127;
        System.out.println("Maximum number of Byte is 127 and -128" + s);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
    }
}
