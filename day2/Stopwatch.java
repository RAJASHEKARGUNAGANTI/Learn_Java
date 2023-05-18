package com.company.Learn_Java.day2;

public class Stopwatch {
    void start (){
        for(int i = 1; i < 10; i++){
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        Stopwatch s = new Stopwatch();
        s.start();
    }

}
