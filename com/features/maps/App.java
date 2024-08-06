package com.features.maps;

import java.util.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello");
        Map<Character, Integer> map = new HashMap<>();
        String plain = "AAABNBAXCVL";
        for(int x = 0; x < plain.length(); ++x) {
            map.merge(plain.charAt(x), 1, (oldValue, newValue) ->{
                System.out.println("Old -> " + oldValue);
                return oldValue + newValue;
            });

        }
        map.forEach((k, v) ->{
            System.out.println(k + " = " + v);
        });






    }
}
