package com.dsa.day2.impl;

public class StackImpl<E> {
    private int top;
    private final Object[] stack;

    public StackImpl() {
        this(5);
    }
    public StackImpl(int capacity) {
        if(capacity <= 0) {
            capacity = 10;
        }
        this.top = -1;
        this.stack = new Object[capacity];
    }

    public void push(E element) {
        if (top == this.stack.length - 1) {
            throw new RuntimeException("could not push to stack as the top is " + top + " And the size of stack is " + stack.length);
        }
        top ++;
        this.stack[this.top] = element;
    }

    public E pop() {
        if (top < 0) {
            throw new RuntimeException("could not pop from stack as the top is " + top);
        }
        E element = peek();
        top--;
        return element;
    }

    @SuppressWarnings("unchecked")
    public E peek() {
        if (top < 0) {
            throw new RuntimeException("could not pop from stack as the top is " + top);
        }
        return (E) this.stack[top];
    }
    public void showElements() {
        for (int i = 0; i <= top; i++) {
            if(i != top)
                System.out.print(stack[i] + ",");
            else
                System.out.print(stack[i]);
        }

    }
}
