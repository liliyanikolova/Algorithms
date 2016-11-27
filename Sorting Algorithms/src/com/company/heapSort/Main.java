package com.company.heapSort;

public class Main {
    public static void main(String[] args) {
        int[] inputArray = {3, 1, 5, 11, 9, 6, 67, 34, 7, 51, 35, 43};
        heapSort(inputArray);
    }

    public static void heapSort(int[] inputArray){
        buildHeap(inputArray);

        for (int i = inputArray.length - 1; i >= 0; i--) {
            exchange(inputArray, 0, i);
            maxHeap(inputArray, 0, i);
        }
    }

    private static void buildHeap(int[] inputArray) {
        for (int i = (inputArray.length - 1) / 2; i >= 0; i--) {
            maxHeap(inputArray, i, inputArray.length);
        }
    }

    private static void maxHeap(int[] inputArray, int i, int n) {
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if (left < n && inputArray[left] > inputArray[largest]){
            largest = left;
        }

        if (right < n && inputArray[right] > inputArray[largest]){
            largest = right;
        }

        if (i != largest){
            exchange(inputArray, i, largest);
            maxHeap(inputArray, largest, n);
        }
    }

    public static void exchange(int[] inputArray, int a, int b){
        int temp = inputArray[a];
        inputArray[a] = inputArray[b];
        inputArray[b] = temp;
    }
}
