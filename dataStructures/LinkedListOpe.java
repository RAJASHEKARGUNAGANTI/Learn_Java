package com.company.Learn_Java.dataStructures;

import java.util.LinkedList;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
public class LinkedListOpe {
    Node head;
    LinkedListOpe(){
        head = null;
    }
    void addEnd(int data){
        Node nn = new Node(data);
        Node temp = head;
        if(head == null){
            head = nn;
        }
        else if(head.next == null){
            head.next = nn;
        }
        else{
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = nn;
        }
    }
    void addFirst(int data){
        Node nn = new Node(data);
        Node temp = head;
        if(head == null){
            head = nn;
        }
        else if(temp.next == null){
            nn.next = temp;
        }
        else {
            nn.next = temp;
            head = nn;
        }
    }
    void addAtPosition(int data, int position){
        Node nn = new Node(data);
        Node temp = head;
        if(head == null){
            head = nn;
            return;
        }
        else if(temp.next == null){
            nn.next = temp;
        }
        else{
        while(position > 1){
            position --;
            temp = temp.next;
        }
            nn.next = temp.next;
            temp.next = nn;
        }
    }
    void deleteFirstNode(){
        Node temp = head;
        if(head == null) {
            System.out.println("Lis is empty..!");
            return;
        }
        else if(temp.next == null){
            System.out.println("Deleted node is " + head.data);
            head = null;
        }
        else {
            System.out.println("Deleted node is "+head.data);
            head = head.next;
        }
    }
    void deleteLastNode(){
        Node temp = head;
        if(head == null) {
            System.out.println("Lis is empty..!");
            return;
        }
        else if(temp.next == null){
            System.out.println("Deleted node is " + head.data);
            head = null;
        }
        else {
            while (temp.next.next != null){
                temp = temp.next;
            }
            System.out.println("Deleted node is "+temp.next.data);
            temp.next = null;

        }
    }
    void deleteAtPosition(int position){
        Node temp = head;
        if(head == null) {
            System.out.println("Lis is empty..!");
            return;
        }
        else if(temp.next == null){
            System.out.println("Deleted node is " + head.data);
            head = null;
        }
        else {
            while (position > 1){
                temp = temp.next;
                position --;
            }
            System.out.println("Deleted node is "+temp.next.data);
            temp.next = temp.next.next;
//            temp.next =

        }
    }

    void searchNode(int data){
        Node temp = head;
        if(head == null) {
            System.out.println("Lis is empty..!");
            return;
        }
        else{
            while (temp.next != null) {
                if (temp.data == data) {
                    System.out.println(temp.data + " Node is Found");
                }
                temp = temp.next;
            }
            System.out.println(data + " Node is not Found");
        }
    }

    void peak(){
        if(head == null) {
            System.out.println("Lis is empty..!");
            return;
        }
        else
            System.out.println(head.data + " is Peak node");
    }

    int  displayList(Node head,int size){
        Node temp = head;
        if(head== null) {
            System.out.println("List is empty..!" + size);
            return 0;
        }
//        else{
//            while (temp.next != null){
//                System.out.println(temp.data);
//                temp = temp.next;
//            }
//            System.out.println(temp.data);
//        }
        System.out.println(temp.data);
        return displayList(temp.next,size++);
    }


    public static void main(String[] args) {
        LinkedListOpe l1 = new LinkedListOpe();
        l1.addFirst(90);
        l1.addEnd(10);
        l1.addEnd(13);
        l1.addEnd(23);
        l1.addEnd(324);
        l1.addEnd(133);
        l1.addFirst(909);
        l1.addAtPosition(77,3);
        l1.displayList(l1.head,0);
        System.out.println("----------------------------------------");
        l1.peak();
        System.out.println("----------------------------------------");
        l1.searchNode(99);
        System.out.println("----------------------------------------");
        l1.deleteAtPosition(3);
        System.out.println("---------------------------------------");
        l1.deleteFirstNode();
        System.out.println("---------------------------------------");
        l1.deleteLastNode();
        System.out.println("---------------------------------------");
        l1.displayList(l1.head,0);
    }


}

