package com.company.bubbleSort;

public class Main {
    public static void main(String[] args) {
        int[] inputArray = {3, 1, 5, 11, 9, 6};
        bubbleSort(inputArray);
    }

    public static int[] bubbleSort(int[] inputArray){
        boolean swap = true;
        int dec = 1;
        int offset = 1;
        while (swap){
            swap = false;
            for (int i = 0; i < inputArray.length - offset; i++) {
                if (inputArray[i] > inputArray[i + 1]){
                    int temp = inputArray[i];
                    inputArray[i] = inputArray[i + 1];
                    inputArray[i + 1] = temp;
                    swap = true;
                }
            }

            offset++;
        }

        return inputArray;
    }
}
