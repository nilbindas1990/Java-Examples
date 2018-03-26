package com.example.JavaExamples;

import java.util.Arrays;
import java.util.Scanner;

public class ConsecutiveNumber {

    public static void main(String []args){

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        //Checking the range of array size and array elements.
        if (n > 1 && n < 100000){
            for (int i = 0; i < n; i++){
                int temp = s.nextInt();
                if (temp > 1 && temp < 100000){
                    arr[i] = temp;
                }
            }
        }

        Arrays.sort(arr);

        //Calling the function which will check
        //whether the array is consecutive.
        String conCheck = consecutiveCheck(arr);
        System.out.println(conCheck);
    }

    private static String consecutiveCheck(int[] arr) {


        //If the array is decreasing.
        if (arr[0] > arr[arr.length -1]) {

            for (int i = 0; i <= arr.length - 1; i++){
                int diff = arr[i] - arr[i+1];
                if (diff == 1){
                    if (i+1 == arr.length -1){
                        return "True";
                    }
                    else {
                        continue;
                    }
                }
                else {
                    return "False";
                }
            }
        }
        //If the array is increasing.
        else if (arr[0] < arr[arr.length - 1]){

            for (int i = 0; i < arr.length; i++){
                int diff = arr[i + 1] - arr[i];
                if (diff == 1){
                    if (i+1 == arr.length -1){
                        return "True";
                    }
                    else {
                        continue;
                    }
                }
                else {
                    return "False";
                }
            }
        }

        return "False";
    }
}
