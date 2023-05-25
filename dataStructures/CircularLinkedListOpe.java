package com.company.Learn_Java.dataStructures;

class CNode{
    int data;
    CNode next;
    CNode(int data){
        this.data = data;
        next = null;
    }
}
public class CircularLinkedListOpe {
    CNode head = null;
    CNode tail = null;
    void addAtEnd(int data) {
        CNode nn = new CNode(data);
        if (head == null) {
            head = tail = nn;
        } else {
            tail.next = nn;
            nn.next = head;
            tail = nn;
        }
    }
    void addAtFront(int data) {
        CNode nn = new CNode(data);
        if (head == null) {
            head = tail = nn;
        } else {
            nn.next = head;
            tail.next = nn;
            head = nn;
        }
    }
    void deletEnd() {
        if (head.next == null) {
            System.out.println("List is  empty..!");
        }
        else if (head.next == null){
            System.out.println("Deleted node is" + head.data);
            head = tail = null;
        }
        else{
            CNode temp = head;
            while(temp.next != tail){
                temp = temp.next;
            }
            System.out.println("Deleted node is " + tail.data);
            temp.next = head;
            tail = temp;
        }
    }
    void deleteFront(){
        if(head == null) System.out.println("List is empty..!");
        else if(head.next == null){
            System.out.println("Deleted node is " + head.data);
            head = tail = null;
        }
        else{
            CNode temp = head;
            System.out.println("Deleted node is " + head.data);
            tail.next = temp.next;
            head = temp.next;
        }
    }
    void deleteAfter(int data){
        CNode temp = head;
        if(head == null) System.out.println("List is empty..!");
        else{

        }
    }
    void delBefore(int data){
        CNode temp = tail;
        if(head.data == data || head == null || head.next == null) System.out.println("Cannot delete..!");
        else if(head.next.data == data){
                deleteFront();
        }
        else {
            while (temp.next.data != data){
                temp = temp.next;
            }
            System.out.println("Deleted node is "+ temp.data);

        }
    }

    void display () {
        if (head == null) System.out.println("List id empty..!");
        else {
            CNode temp = head;
            do {
                System.out.print(temp.data + " <--");
                temp = temp.next;
            }
            while ( head != temp );
                System.out.print(head.data +" is head node");
        }
    }

    public static void main(String[] args) {
        CircularLinkedListOpe c = new CircularLinkedListOpe();
        c.addAtEnd(10);
        c.addAtEnd(20);
        c.addAtEnd(30);
        c.display();
        System.out.println("\n-------------------------------");
        c.addAtFront(40);
        c.addAtFront(50);
        c.display();
        System.out.println("\n-------------------------------");
        c.deletEnd();
        c.display();
        System.out.println("\n-------------------------------");
        c.deleteFront();
        c.display();
    }
}
