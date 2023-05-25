package com.company.Learn_Java.algorithams;

import java.util.Arrays;

public class HeapSort {
    static void minheapify(int[] arr, int n, int i){
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;
        if(left < n && arr[left] > arr[largest])
            largest=left;
        if(right < n && arr[right] > arr[largest])
            largest=right;
        if(largest != i) {
//            swap(arr[i], arr[largest]);
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            minheapify(arr,n,largest);
        }
    }
    static void maxheapify(int[] arr, int n, int i){
        int smallest = i;
        int left = 2*i+1;
        int right = 2*i+2;
        if(left > n && arr[left] < arr[smallest])
            smallest=left;
        if(right > n && arr[right] < arr[smallest])
            smallest=right;
        if(smallest != i) {
//            swap(arr[i], arr[smallest]);
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
            maxheapify(arr,n,smallest);
        }
    }

    static void printElements(int arr[]){
        for (int i = 0; i < arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    static void minheapSort(int[] array) {
        int n = array.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            minheapify(array, n, i);
        }

        // One by one extract an element from heap
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Call max heapify on the reduced heap
            minheapify(array, i, 0);
        }
    }
    static void maxheapSort(int[] array) {
        int n = array.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            maxheapify(array, n, i);
        }

        // One by one extract an element from heap
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Call max heapify on the reduced heap
            maxheapify(array, i, 0);
        }
    }

    public static void main(String[] args) {
        int[] arr = {34,6,1,44,8,9,0,3,45};
        System.out.println(Arrays.toString(arr));
//        printElements(arr);
        System.out.println("--------------------------------------------");
            minheapSort(arr);
//            printElements(arr);
        System.out.println(Arrays.toString(arr));
        maxheapSort(arr);
        System.out.println("--------------------------------------------");
        System.out.println(Arrays.toString(arr));
    }
}
