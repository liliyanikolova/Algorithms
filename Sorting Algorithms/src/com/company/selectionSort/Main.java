package com.company.selectionSort;

public class Main {

    public static void main(String[] args) {
        int[] inputArray = {3, 1, 5, 9, 11, 6};
        selectionSort(inputArray);
    }

    public static int[] selectionSort(int[] inputArray){
        for (int i = 0; i < inputArray.length - 1; i++) {
            int minElement = inputArray[i];
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[j] < minElement){
                    int temp = minElement;
                    minElement = inputArray[j];
                    inputArray[j] = temp;
                    inputArray[i] = minElement;
                }
            }
        }

        return inputArray;
    }
}
