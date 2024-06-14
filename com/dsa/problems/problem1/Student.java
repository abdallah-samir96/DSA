package com.dsa.problems.problem1;

import java.util.Arrays;
import java.util.OptionalInt;

public class Student {
    private final int []degrees;

    public Student() {
        System.out.println("Constructor for initializing degrees");
        degrees = new int[]{20, 30, 33, 40, 50};
    }

    /**
     * This method is used to get the maximum degree in the Array
     * */
    public int getMaxDegree() {
        OptionalInt optionalInt =  Arrays.stream(degrees).max();
        if (optionalInt.isPresent()) {
            return optionalInt.getAsInt();
        }
        return 0;
    }
    /**
     * This method is used to get the minimum degree in the Array
     * */
    public int getMinDegree() {
        OptionalInt optionalInt =  Arrays.stream(degrees).min();
        if (optionalInt.isPresent()) {
            return optionalInt.getAsInt();
        }
        return 0;
    }
    /**
     * return the sum of all degrees in the array
     * */
    public int getSum() {
        return Arrays.stream(degrees).sum();
    }
    public double range() {
        return (double)getSum() / degrees.length;
    }
    public void printDegrees() {
        new Thread(()->{
            for (int degree: degrees) {
                System.out.println(degree);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}