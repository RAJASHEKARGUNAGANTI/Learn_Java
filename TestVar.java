package com.company.Learn_Java;

public class TestVar {
    static int a = 10;    // static variable
    static int d;
    int b = 20;           // non-static variable
    void fun(){
        int c;       // local variable
//        System.out.println(c); // gives error

    }

    public static void main(String[] args) {

        System.out.println(d);
    }
}
 class TestVar2{
     public static void main(String[] args) {

         System.out.println(TestVar.a);
     }
}
