package com.company.Learn_Java.dataStructures;

public class DeQueueOpe {
    int left = -1;
    int right = -1;
    int arr[];
    final int SIZE;
    DeQueueOpe(int SIZE){
        this.SIZE = SIZE;
        arr = new int[SIZE];
    }
    DeQueueOpe(){
        SIZE = 10;
        arr = new int[SIZE];
    }
    boolean isEmpty(){
        if(left == -1 && right ==-1) return true;
        return false;
    }
    boolean isFull(){
        if(left == 0 && right ==SIZE-1) return true;
        if(right +1 == left) return true;
        return false;
    }

}
