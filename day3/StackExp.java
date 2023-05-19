package com.company.Learn_Java.day3;

import java.util.Stack;

public class StackExp {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("java");
        s.push(12);
        s.push("Broiler");
        s.push("Ghost");
        s.push("Potti");
        System.out.println(s);
        s.pop();
        System.out.println(s);
        s.peek();
        System.out.println(s);
        s.empty();
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        System.out.println(s.search(12));
        System.out.println(s.contains(12));
        s.removeAllElements();
        s.clear();

        System.out.println(s);
    }
}
