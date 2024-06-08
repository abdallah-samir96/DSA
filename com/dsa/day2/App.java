package com.dsa.day2;

import com.dsa.day2.impl.StackImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class App {
    private static final Map<Character, Character> characterLookup = new HashMap<>();

    static {
        // here we could put all types of balanced character
        characterLookup.put(']', '[');
        characterLookup.put('}', '{');
        characterLookup.put(')', '(');
        characterLookup.put('>', '<');
        characterLookup.put('\\', '/');
    }
    public static void main(String[] args) {
        /*
        Stack<Integer> stack = new Stack<>();
        //makeOperation(stack);
        StackImpl<Integer> stackImpl = new StackImpl<>();
        System.out.println(stackImpl.isEmpty());
        stackImpl.push(100);
        stackImpl.push(200);
        stackImpl.push(200);
        stackImpl.push(700);
        stackImpl.push(800);
        System.out.println(stackImpl.isFull());
        stackImpl.pop();
        stackImpl.pop();
        System.out.println("Value on Top of Stack " + stackImpl.peek());
        stackImpl.showElements();
         */
        System.out.println("Representing all patterns using Map as a lookup");
        String pattern = "{{[][][][][</\\>](({()}))}}";
        System.out.println(checkBalancedBraces(pattern));
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

    /**
     * Simple method for representing balanced braces and used with specific types of braces as we should make Map for open and colsing braces
     * Map<{@link Character, Character}> this should be used to define all opened and closed braces
     * */
    private static boolean checkBalancedBraces(String pattern) {
        StackImpl<Character> stack = new StackImpl<>();
        int currentPosition = 0;
        char currentCharacter;
        while (currentPosition < pattern.length()) {
            currentCharacter = pattern.charAt(currentPosition);
            if (!stack.isEmpty()) {
                char currentStackElement = stack.peek();
                int openCharacterValue = characterLookup.getOrDefault(currentCharacter, '\u0000');
                if(openCharacterValue == currentStackElement) {
                    stack.pop();
                } else {
                    stack.push(currentCharacter);
                }
            } else {
                stack.push(currentCharacter);
            }
            ++currentPosition;
        }
        return stack.isEmpty();
    }
}