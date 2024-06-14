package com.dsa.problems.problem2;

import java.util.Arrays;
import java.util.OptionalInt;

public class Employee {
    private final int []salaries;

    public Employee() {
        System.out.println("Constructor for initializing degrees");
        salaries = new int[]{20, 30, 33, 40, 50};
    }

    /**
     * This method is used to get the maximum salary in the Array
     * */
    public int getMaxSalary() {
        OptionalInt optionalInt =  Arrays.stream(salaries).max();
        if (optionalInt.isPresent()) {
            return optionalInt.getAsInt();
        }
        return 0;
    }
    /**
     * This method is used to get the minimum salary in the Array
     * */
    public int getMinSalary() {
        OptionalInt optionalInt =  Arrays.stream(salaries).min();
        if (optionalInt.isPresent()) {
            return optionalInt.getAsInt();
        }
        return 0;
    }
    /**
     * return the sum of all salaries in the array
     * */
    public int getSum() {
        return Arrays.stream(salaries).sum();
    }
    public double range() {
        return (double)getSum() / salaries.length;
    }
    public void printSalaries() {
        new Thread(()->{
            for (int salary: salaries) {
                System.out.println(salary);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}
