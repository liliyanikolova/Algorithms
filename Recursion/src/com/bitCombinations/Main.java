package com.bitCombinations;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 8;
        int[] arr = new int[n];

        generateAllBitsCombinations(arr, 0);
    }

    public static void generateAllBitsCombinations(int[] arr, int index){
        if (index >= arr.length){
            System.out.println(Arrays.toString(arr));
            return;
        }

        for (int i = 0; i <= 1; i++) {
            arr[index] = i;
            generateAllBitsCombinations(arr, index + 1);
        }
    }
}
