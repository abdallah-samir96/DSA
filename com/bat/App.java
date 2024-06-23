package com.bat;

import java.lang.reflect.Array;
import java.nio.file.FileSystems;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class App{
    public static void main(String[] args) {
        /*
        System.out.println(FileSystems.getDefault().getSeparator());
        System.out.println(System.getProperty("file.separator"));
        System.out.println(System.getProperty("java.version", "21"));
        System.out.println("*******************************************");
        System.getProperties().forEach((k,v) -> System.out.println(k + " = " + v));

         */
        showMarks();
    }
    public static void showMarks() {
        Integer []scores = new Integer[] {100, 50, 90, 20, 10, 0};
        var result = getMarks(scores);
        result.forEach((k, v)-> {
            System.out.println(k + " = " + v);
        });
    }
    private static Map<Integer, Integer> getMarks(Integer [] scores) {
        Map<Integer, Integer> marksMap = new HashMap<>();
        Integer []scoresClone =  scores.clone();
        Arrays.sort(scoresClone);
        for (int i = 0; i < scores.length; i++) {
            marksMap.put(scores[Arrays.binarySearch(scoresClone, scores[i])], i + 1);
        }
        return marksMap;
    }
}