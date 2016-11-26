package com.company.quickSort.lomutoPartitioning;

public class Main {
    public static void main(String[] args) {
        int[] inputArray = {5, 2, 8, 4, 1, 7, 3};
        quickSort(inputArray, 0, inputArray.length - 1);
    }

    public static int[] quickSort(int[] inputArray, int low, int high){
        if(low < high){
            int p = partition(inputArray, low, high);
            quickSort(inputArray, low, p - 1);
            quickSort(inputArray, p + 1, high);
        }

        return inputArray;
    }

    private static int partition(int[] inputArray, int low, int high) {
        int pivot = inputArray[low];
        int store = low + 1;

        for (int i = store; i <= high; i++) {
            if(inputArray[i] <= pivot){
                int temp = inputArray[i];
                inputArray[i] = inputArray[store];
                inputArray[store] = temp;
                store++;
            }
        }

        store--;
        int temp = inputArray[low];
        inputArray[low] = inputArray[store];
        inputArray[store] = temp;

        return store;
    }


}
