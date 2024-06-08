package com.dsa.day2;

import com.dsa.day2.impl.StackImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UndoRedoOperation {
    public static void main(String[] args) throws IOException {

        var stack = new StackImpl<String>();
        boolean run = true;
        // this is decorator patten
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Choose Operation");
        System.out.println("1 to do");
        System.out.println("2 to undo");
        System.out.println("3 view history");
        while (run) {
            System.out.println("Enter your Choice?!");
            int choice = Integer.parseInt(reader.readLine());
            if (choice == 1) {
                System.out.println("Enter Name");
                stack.push(reader.readLine());
            } else if (choice == 2) {
                System.out.println("Last Operations is " + stack.pop());
            } else if (choice == 3) {
                System.out.println("All operations are: ");
                stack.showElements();
                System.out.println();
            }
            System.out.println("Need to Continue?! true | false");
            run = Boolean.parseBoolean(reader.readLine());
        }
    }
}
