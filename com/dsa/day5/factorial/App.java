package com.dsa.day5.factorial;

public class App {
    public static void main(String[] args) {
        long start1 = System.currentTimeMillis();
        fact(12000);
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1);
        long start2 = System.currentTimeMillis();
        long factResult = factorial(50000);
        System.out.println(factResult);
        long end2 = System.currentTimeMillis();
        System.out.println(end2 - start2);
    }
    public static long fact(int n) {
        if(n < 0) {
            throw new RuntimeException("Factorial of N should be positive value!!");
        }
        if(n == 0 || n == 1)
            return 1;
        return n * fact(n-1);
    }

    public static long factorial(int c) {
        if(c < 0) {
            throw new RuntimeException("Factorial of N should be positive value!!");
        }
        long result = 1;
        for(int j = 2; j <= c; j++) {
            result *= j;
        }
        return result;
    }
}
