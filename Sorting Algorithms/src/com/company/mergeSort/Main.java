package com.company.mergeSort;

public class Main {
    public static void main(String[] args) {
        int[] inputArray = {5, 2, 8, 4, 1, 7, 3};
        mergeSort(inputArray);
    }

    public static int[] mergeSort(int[] inputList) {
        if (inputList.length <= 1){
            return inputList;
        }

        int middle = inputList.length / 2;

        int[] firstList = new int[middle];
        int[] secondList = new int[inputList.length - middle];

        System.arraycopy(inputList, 0, firstList, 0, firstList.length);
        System.arraycopy(inputList, middle, secondList, 0, secondList.length);

        mergeSort(firstList);
        mergeSort(secondList);

        merge(firstList, secondList, inputList);

        return inputList;
    }

    private static void merge(int[] firstList, int[] secondList, int[] inputList) {
        int firstIndex = 0;
        int secondIndex = 0;
        int mergedIndex = 0;

        int [] mergedList = new int[firstList.length + secondList.length];
        while (firstIndex < firstList.length && secondIndex < secondList.length){
            if (firstList[firstIndex] < secondList[secondIndex]){
                mergedList[mergedIndex] = firstList[firstIndex];
                firstIndex++;
            }else {
                mergedList[mergedIndex] = secondList[secondIndex];
                secondIndex++;
            }

            mergedIndex++;
        }

        while (firstIndex < firstList.length){
            mergedList[mergedIndex] = firstList[firstIndex];
            mergedIndex++;
            firstIndex++;
        }

        while (secondIndex < secondList.length){
            mergedList[mergedIndex] = secondList[secondIndex];
            mergedIndex++;
            secondIndex++;
        }

        System.arraycopy(mergedList, 0, inputList, 0, inputList.length);
    }
}
