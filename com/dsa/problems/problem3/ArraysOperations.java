package com.dsa.problems.problem3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArraysOperations {
    private final int []arr;
    public ArraysOperations() {
        arr = new int[]{10,10, 100, 15, 17, 28, 19, 5, 5, 10, 5, 10};
    }

    public double range() {
        return (double)sum() / arr.length;

    }
    public int sum() {
        return Arrays.stream(arr).sum();
    }

    public void sort() {
        Arrays.sort(arr);
    }
    public int maxRepeatableNumber () {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        int maxCount = 0;
        int maxRepeatableNumber = 0;

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int number = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount) {
                maxCount = count;
                maxRepeatableNumber = number;
            }
        }
        return maxRepeatableNumber;
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
