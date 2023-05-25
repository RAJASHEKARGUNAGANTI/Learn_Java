package com.company.Learn_Java.algorithams;

public class SelectionSort {
    void swap(int []arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    void sort(int[]arr) {
        int min_inx=0;
        for (int j = 0; j < arr.length-1 ; j++) {
            int min = arr[j];

            for (int i = j+1 ; i < arr.length; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                    min_inx = i;
                }
            }
            if(min < arr[j]) swap(arr,min_inx, j);
        }
    }
    public static void main(String[] args) {
        int [] arr = {9,5,15,1,3};
        SelectionSort s = new SelectionSort();
        s.sort(arr);
        for(int j =0; j < arr.length; j++){
            System.out.print(arr[j]+ " ");
        }
    }

}
