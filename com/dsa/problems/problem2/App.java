package com.dsa.problems.problem2;

public class App {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println("Max Salary : " + employee.getMaxSalary());
        System.out.println("Min Salary : " + employee.getMinSalary());
        System.out.println("Range : " + employee.range());
        System.out.println("Sum of Salaries : " + employee.getSum());
        employee.printSalaries();
    }
}
