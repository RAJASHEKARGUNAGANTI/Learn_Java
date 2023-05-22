package com.company.Learn_Java.dataStructures;


public class CircularQueueOpe {
    int left =-1;
    int right = -1;
    int []arr ;
    final int size;
    CircularQueueOpe(){
        size =10;
        arr = new int[size];
    }
    CircularQueueOpe(int size){
        this.size =size;
        arr = new int[size];
    }
    boolean isEmpty(){
        if(left == -1 && right ==-1) return true;
        return false;
    }
    boolean isFull(){
        if(left == 0 && right ==size-1) return true;
        if(right +1 == left) return true;
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
        if(isFull() && (left == size-1)) left = 0;
        else if(left == right)  left = right -1;
        int data = arr[left];
        left++;
        return data;
        }
    int sizeQ(){
        if(left < right) return right - left + 1;
        return size - left + right + 1;
    }
    int peek(){
        if(isEmpty()) return -1;
        return arr[left];
    }
    boolean searchCQ(int key) {
        if(!isEmpty()){
            if( left <= right){
                for(int i = left; i <= right; i++){
                    if(key == arr[i]) return true;
                }
            }
            else {
                for(int i = left; i < size; i++){
                    if(key == arr[i]) return true;
                }
                for(int i = 0; i <= right; i++){
                    if(key == arr[i]) return true;
                }
            }
        }
        return false;
    }
    void display(){
        if(!isEmpty()){
            if( left <= right){
                for(int i = left; i <= right; i++){
                    System.out.println(arr[i]);
                }
            }
            else {
                for(int i = left; i < size; i++){
                    System.out.println(arr[i]);
                }
                for(int i = 0; i <= right; i++){
                    System.out.println(arr[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        CircularQueueOpe c = new CircularQueueOpe();
        System.out.println(c.deQueue());
        System.out.println(c.enQueue(33));
        System.out.println(c.enQueue(87));
        System.out.println(c.enQueue(67));
        System.out.println(c.enQueue(556));
        System.out.println(c.deQueue());
        System.out.println(c.sizeQ());
        System.out.println(c.peek());
        System.out.println(c.searchCQ(87));
        c.display();
    }
}
