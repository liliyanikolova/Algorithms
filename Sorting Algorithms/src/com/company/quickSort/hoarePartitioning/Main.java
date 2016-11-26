package com.company.quickSort.hoarePartitioning;

public class Main {
    public static void main(String[] args) {
        int[] inputArray = {5, 2, 8, 4, 1, 7, 3};
        quickSort(inputArray, 0, inputArray.length - 1);
    }

    public static int[] quickSort(int[] inputArray, int low, int high){
        if (low < high){
            int p = partition(inputArray, low, high);
            quickSort(inputArray, low, p);
            quickSort(inputArray, p + 1, high);
        }

        return inputArray;
    }

    private static int partition(int[] inputArray, int low, int high) {
        int pivot = inputArray[low];
        int left = low;
        int right = high;

        while (true){
            do {
                right--;
            } while(inputArray[right] > pivot);

            do {
                left++;
            } while (inputArray[left] < pivot);

            if (left < right){
                int temp = inputArray[left];
                inputArray[left] = inputArray[right];
                inputArray[right] = temp;
            } else {
                return right;
            }
        }
    }
}
