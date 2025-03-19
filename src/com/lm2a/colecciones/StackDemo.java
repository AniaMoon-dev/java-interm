package com.lm2a.colecciones;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");

        String pop = stack.pop();

        System.out.println(pop);

        String pop2 = stack.pop();

        System.out.println(pop2);

    }
}
