package com.company.Learn_Java.algorithams;

import java.util.Arrays;

public class InsertionSort {
    static void insertSort(int a[]){
        int least;
        for(int i = a.length-1; i>=0 ; i--){
            for(int j=0;j< i;j++){
                least = a[i];
                if(a[j] > least){
                    for(int k =i; k > j;k--)
                        a[k] = a[k-1];
                    a[j] =least;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {8,7,3,12,9,5,16,89};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
