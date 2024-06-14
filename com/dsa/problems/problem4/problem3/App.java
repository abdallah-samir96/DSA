package com.dsa.problems.problem4.problem3;

public class App {
    public static void main(String[] args) {

        ArraysOperations arraysOperations = new ArraysOperations();
        System.out.println("===================================================");
        System.out.println("Sum : " + arraysOperations.sum());
        System.out.println("===================================================");
        System.out.println("Search : " + arraysOperations.search(1000));
        System.out.println("===================================================");
        System.out.println("Min repeatable : " + arraysOperations.minRepeatableNumber());
        System.out.println("===================================================");
        arraysOperations.printValues();
    }
}
