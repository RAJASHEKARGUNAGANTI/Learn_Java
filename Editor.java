package com.company.Learn_Java;

public class Editor {
    int top = -1;
    String [] stack ;
    int size;
    Editor (int size){
        this.size = size;
        stack = new String[size];
    }
    void display(){
        for(int i = 0; i< top; i++){
            System.out.println(stack[i]);
        }
    }
    boolean ifFull(){
        if(top == size){
            return true;
        }
        return false;
    }
    boolean ifEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }
    void type(String text){
        if(! ifFull()){
        top++;
        stack[top] = text;
      }
        else{
            System.out.println("Stack is full");
        }
    }
    void ctrlZ(){
        if(ifEmpty()){
            return ;
        }
        else{
            stack[top--] = "";
//            top--;
        }
    }
    void add(String s){
        stack[++top] = s;
    }

    public static void main(String[] args) {
     Editor e = new Editor(5);
     e.add("Sowmya");
     e.add("Neha");
     e.add("Udhay");
     e.add("Raj");
        System.out.println(e.ifFull());
        System.out.println(e.ifEmpty());
     e.ctrlZ();
     e.display();
    }
}
