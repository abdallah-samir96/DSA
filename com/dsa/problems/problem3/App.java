package com.dsa.problems.problem3;

public class App {
    public static void main(String[] args) {

        ArraysOperations arraysOperations = new ArraysOperations();
        System.out.println("===================================================");
        System.out.println("Sum : " + arraysOperations.sum());
        System.out.println("===================================================");
        System.out.println("Range : " + arraysOperations.range());
        System.out.println("===================================================");
        System.out.println(arraysOperations.maxRepeatableNumber());
        System.out.println("===================================================");
        arraysOperations.sort();
        arraysOperations.printValues();
    }
}
