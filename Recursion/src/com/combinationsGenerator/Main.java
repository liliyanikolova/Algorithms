package com.combinationsGenerator;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int n = 3;
        int[] arr = new int[n];
        generateAllCombinations(arr, 0, 5, 9);
    }

    public static void generateAllCombinations(int[] arr, int index, int startNum, int endNum){
        if (index >= arr.length ){
            System.out.println(Arrays.toString(arr));
            return;
        }

        for (int i = startNum; i <= endNum; i++) {
            arr[index] = i;
            generateAllCombinations(arr, index + 1, i + 1, endNum);
        }
    }
}
