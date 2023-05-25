package com.company.Learn_Java.dataStructures;

class DNode {
    int data;
    DNode next;
    DNode prev;
    DNode(int data){
        this.data = data;
        next = prev = null;
    }
}
public class DoubbleLinkedListOpe {
    DNode head = null;
    DNode tail = null;
    void insertEnd(int data){
        DNode nn = new DNode(data);
        if(head == null) {
            tail = nn;
            head = nn;
        }
        else if(head.next == null){
            nn.prev = head;
            head.next = nn;
            tail = nn;
        }
        else{
            nn.prev = tail;
            tail.next = nn;
            tail = nn;
        }
    }

    void insertFront(int data) {
        DNode nn = new DNode(data);
        if (head == null)
            head = tail= nn;
        else if (head.next == null){
            nn.next =head;
            head.prev = nn;
            head = nn;
        }
        else {
            nn.next = head;
            head.prev = nn;
            head = nn;
        }
    }
    void deleteEnd(){
        if (head == null)
            System.out.println("List is empty..!");
        else if (head.next == null) {
            System.out.println("Deleted the node " + tail.data);
            head = tail = null;
        }
        else{
            System.out.println("Deleted the node " + tail.data);
            DNode temp2 = tail;
            tail = tail.prev;
            tail.next = null;
        }
    }

    void displayD(){
        DNode temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        DoubbleLinkedListOpe d = new DoubbleLinkedListOpe();
        d.deleteEnd();
        d.insertEnd(56);
        d.insertFront(87);
        d.insertFront(287);
        d.insertFront(855);
        d.insertFront(858);
        d.insertEnd(560);
        d.displayD();
        System.out.println("-------------------------------");
        d.deleteEnd();
        d.insertEnd(156);
        d.displayD();
    }
}