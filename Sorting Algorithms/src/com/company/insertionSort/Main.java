package com.company.insertionSort;

public class Main {
    public static void main(String[] args) {
        int[] inputArray = {3, 1, 5, 11, 9, 6};
        insertionSort(inputArray);
    }

    public static int[] insertionSort(int[] inputArray){
        for (int i = 1; i < inputArray.length; i++) {
            while (i > 0 && inputArray[i] < inputArray[i - 1]){
                int temp = inputArray[i];
                inputArray[i] = inputArray[i - 1];
                inputArray[i - 1] = temp;

                i--;
            }
        }

        return inputArray;
    }
}
