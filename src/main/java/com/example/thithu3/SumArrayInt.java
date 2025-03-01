package com.example.thithu3;

public class SumArrayInt {

    public static int sumArray(int[] arr) {
        if (arr.length == 0||arr==null)
            throw new IllegalArgumentException("null or empty array");

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
