package com.company.Learn_Java.day4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedlistExp {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.add(23);
        l1.add(234);
        l1.add(244);
        System.out.println(l1);
        l1.push(87);
        System.out.println(l1);
        l1.pop();
        System.out.println(l1);
        l1.remove(1);
        System.out.println(l1);
        l1.offerFirst(10);
        System.out.println(l1);
        System.out.println(l1.peek());
        l1.pollFirst();
        System.out.println(l1);


        Deque d = new LinkedList(); // double linked list implementation
        Queue s = new LinkedList(); // single linked list implementation

    }
}
