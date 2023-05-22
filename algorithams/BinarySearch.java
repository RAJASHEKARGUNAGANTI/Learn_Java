package com.company.Learn_Java.algorithams;

public class BinarySearch {
    static int[] arr = {4,7,9,12,15,18,21,30,35,49,55,76,89,99};
    static int left =0;
    static int right = arr.length-1;
   static String binarySearch(int[] arr , int key ,int left ,int right){
        int mid = (left+right)/2;
        if(right >= left){
            if(key == arr[mid]) return "FOUND";
            else if(key < arr[mid]) return binarySearch(arr,key,left,mid-1);
            else if(key > arr[mid]) return binarySearch(arr,key,mid+1,right);
        }
        return "NOT FOUND";
   }

    public static void main(String[] args) {
        System.out.println(binarySearch(arr,55,left,right));
        System.out.println(binarySearch(arr,56,left,right));
    }
}
