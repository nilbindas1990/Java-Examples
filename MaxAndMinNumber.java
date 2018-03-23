package com.example.JavaExamples;

import java.util.Scanner;

public class MaxAndMinNumber {

    public static void main(String [] args){

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];

        int oddSum = 0 , evenSum = 0;

        if(n > 1 && n< 100000){

            for(int i = 0; i < n; i++){
                int temp = s.nextInt();
                if (temp > 1 && temp < 100000){
                    arr[i] = temp;
                }
            }
        }

        int largest = findLargest(arr);
        int smallest = findSmallest(arr);
        int product = largest * smallest;
        System.out.print(product);
    }

    private static int findLargest(int[] arr) {
        int large = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > large ){
                large = arr[i];

            }
        }

        return large;
    }

    private static int findSmallest(int[] arr) {
        int small = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < small ){
                small = arr[i];

            }
        }
        return small;
    }
}
