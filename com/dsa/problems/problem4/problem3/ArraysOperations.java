package com.dsa.problems.problem4.problem3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArraysOperations {
    private final int []arr;
    public ArraysOperations() {
        arr = new int[]{10, 10 ,10, 5, 5, 9000, 5, 6, 70, 89};
    }

    public double range() {
        return (double)sum() / arr.length;

    }
    public int sum() {
        return Arrays.stream(arr).sum();
    }

    public boolean search(int x) {
        sort();
        int index = Arrays.binarySearch(arr, x);
        return index >= 0;
    }

    public void sort() {
        Arrays.sort(arr);
    }
    public int minRepeatableNumber () {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        int minCount = 1;
        int minRepeatableNumber = 0;

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int number = entry.getKey();
            int count = entry.getValue();

            if (count <= minCount) {
                minCount = count;
                minRepeatableNumber = number;
            }
        }
        return minRepeatableNumber;
    }
    public void printValues() {
        new Thread(()->{
            for (int val: arr) {
                System.out.println(val);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}
