package com.company.Learn_Java.algorithams;

public class Recursion {
    static int []arr = {3,4,53,643,7546,46,24};
    static int sum =0;
    static void printNum(int n){
        if(n > 0){
            System.out.println(n);
            printNum(n-1);
        }
    }
    static void printArrNum(int i){
        if(i >=0){
            System.out.println(arr[i]);
            printArrNum(i-1);
        }
    }
    static void printArrNumF(int i){
        if(i < arr.length){
            System.out.println(arr[i]);
            printArrNumF(i+1);
        }
    }
    static int sumArray(int i){
        if(i < arr.length){
            sum += arr[i];
            sumArray(i+1);
        }
        return sum;
    }
    static void printPrime(int n){
        if(n > 1){
            for(int i = 2 ; i <= n/2 +1; i++){
                if(n % i == 0) {
                    break;
                }
                else if(i == n/2 +1) System.out.print(n+ " ");
            }
            printPrime(n-1);
        }
    }


    public static void main(String[] args) {
//        Recursion r = new Recursion();
        printNum(5);
        System.out.println("-------------------------------------");
        printArrNum(arr.length-1);
        System.out.println("--------------------------------------");
        printArrNumF(0);
        System.out.println("--------------------------------------");
        System.out.println(sumArray(0));
        System.out.println("--------------------------------------");
        printPrime(50);
    }

}
