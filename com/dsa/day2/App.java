package com.dsa.day2;

import com.dsa.day2.impl.StackImpl;

import java.util.Stack;

public class App {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        //makeOperation(stack);
        StackImpl<Integer> stackImpl = new StackImpl<>();
        stackImpl.push(100);
        stackImpl.push(200);
        stackImpl.push(200);
        stackImpl.push(700);
        stackImpl.push(800);
        stackImpl.push(800);
        stackImpl.pop();
        stackImpl.pop();
        System.out.println("Value on Top of Stack " + stackImpl.peek());
        stackImpl.showElements();
    }
    private static void makeOperation(Stack<Integer> stack) {
        System.out.println("Stack Operations !!!!!!");
        stack.push(100);
        stack.pop();
        stack.push(200);
        System.out.println(stack);
        System.out.println("Peek : " + stack.peek());
        System.out.println(stack);
    }
}