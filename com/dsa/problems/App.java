package com.dsa.problems;

public class App {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Minimum Value : " + student.getMinDegree());
        System.out.println("Maximum Value : " + student.getMaxDegree());
        System.out.println("Sum  : " + student.getSum());
        System.out.println("Range  : " + student.range());
        student.printDegrees();
    }
}
