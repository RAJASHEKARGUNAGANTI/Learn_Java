package com.company.Learn_Java.dataStructures;

public class QueueOperations {
    int left =-1;
    int right = -1;
    int []arr ;
    final int size;
    QueueOperations(){
        size =10;
        arr = new int[size];
    }
    QueueOperations(int size){
        this.size =size;
        arr = new int[size];
    }
    boolean isEmpty(){
        if(left == right) return true;
        return false;
    }
    boolean isFull(){
        if(right == arr.length-1) return true;
        return false;
    }
    int enQueue(int data){
        if(isFull()) return -1;
        else if(isEmpty()) left = 0;
        arr[++right] = data;
        System.out.print("Enqued the data ");
        return data;
    }
    int deQueue(){
        if(isEmpty()) return -1;
        int data = arr[left++];
        System.out.print("Dequeued the data ");
        if(left == right){
            left = -1;
            right = -1;
        }
        return data;
    }
    int sizeD(){
        if(isEmpty()) return -1;
        return right-left+1;
    }
    int peekD(){
        if(isEmpty()) return -1;
        return arr[left];
    }
    boolean searchD(int key){
        if(!isEmpty()){
        for(int i = left; i <= right; i++){
            if(key == arr[i]) return true;
        }
        }
        return false;
    }

    public static void main(String[] args) {
        QueueOperations q = new QueueOperations(5);
        System.out.println(q.deQueue());
        System.out.println(q.enQueue(12));
        System.out.println(q.enQueue(45));
        System.out.println(q.enQueue(122));
        System.out.println(q.deQueue());
        System.out.println(q.sizeD());
        System.out.println(q.peekD());
        System.out.println(q.searchD(122));
    }
}
