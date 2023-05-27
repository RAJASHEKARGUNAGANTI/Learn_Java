package com.company.Learn_Java.examples;

public class StackOpeExp {
    final int SIZE;
    int top = -1;
    int []arr;
    StackOpeExp(int SIZE){
        this.SIZE = SIZE;
        arr = new int[SIZE];
    }
    boolean isEmpty(){
        if(top ==-1) return true;
        return false;
    }
    boolean isFull(){
        if(top == SIZE)return true;
        return false;
    }
    void push(int data){
        if(isFull()) {
            System.out.println("Stack is full..!");
            return;
        }
        arr[++top] = data;
        System.out.println("Data is pushed..!");
    }
    void pop(){
        if(isEmpty()) {
            System.out.println("Satack is empty..!");
            return;
        }
        int del = arr[top--];
        System.out.println("Poped data is " + del);
    }
    void display(){
        for(int i =0; i<= top; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
//        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        StackOpeExp s = new StackOpeExp(5);
        s.push(12);
        s.push(22);
        s.push(32);
        s.push(42);
        s.display();
        s.pop();
        s.display();

    }

}
