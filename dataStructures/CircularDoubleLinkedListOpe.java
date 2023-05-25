package com.company.Learn_Java.dataStructures;

class CDNode{
    int data;
    CDNode next,prev;
    CDNode(int data){
        this.data = data;
        next = prev = null;
    }
}
public class CircularDoubleLinkedListOpe {
    CDNode head = null;
    CDNode tail = null;
    void addAtEnd(int data) {
        CDNode nn = new CDNode(data);

    }
    void display () {
            if (head == null) System.out.println("List id empty..!");
            else {
                while (head.next != null) {
                    System.out.println(head.data + " <-- ");
                    head = head.next;
                }
            }
        }

    public static void main(String[] args) {
        CircularLinkedListOpe c = new CircularLinkedListOpe();
        c.addAtEnd(10);
        c.addAtEnd(20);
        c.addAtEnd(30);
        c.display();

    }
}
