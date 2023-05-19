package com.company.Learn_Java.dataStructures;

public class StackOperations {
    final int size;
    int top = -1;
    int[] arr ;
    StackOperations(int size){
        this.size=size;
        arr = new int[size];
    }
    StackOperations(){
        size =10;
        arr = new int[size];
    }

    boolean isFull(){
        if(top == size) return true;
        return false;
    }
    boolean isEmpty(){
        if(top == -1) return true;
        return false;
    }
    void push(int data){
        if(! isFull()){
            arr[++top] = data;
            System.out.println(data+ " is pushed in to stack");
        }
        else{
            System.out.println("Stack is full..!");
        }
    }
    int pop(){
        if(!isEmpty()){
            int data = arr[top--];
//            System.out.println("Stack is poped..!"+data);
            return data;
        }
//        System.out.println("Stack is empty..!");
        return -1;
    }
    int peek(){
        if(!isEmpty()) return -1;
//        System.out.println(arr[top]);
        return arr[top];
    }
    int sizeS(){
        if(isEmpty()) return -1;
//        System.out.println(top+1);
        return top+1;
    }

    boolean searchS (int key){
        if(!isEmpty()){
            for(int i = top; i >=0 ;i--){
                if(key == arr[i]){ return true;}
            }
        }
        return false;
    }

    public static void main(String[] args) {
        StackOperations s = new StackOperations();
        System.out.println(s.pop());
        s.push(43);
        s.push(143);
        s.push(90);
        System.out.println(s.searchS(143));
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.sizeS());
        System.out.println("------------------------------------------------------------------");
        StackOperations s2 = new StackOperations(5);
        s2.push(43);
        s2.push(143);
        s2.push(90);
        System.out.println(s2.searchS(143));
        System.out.println(s2.pop());
        System.out.println(s2.peek());
        System.out.println(s2.sizeS());
    }
}
