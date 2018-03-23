/* Program to find the product of the sum of odd numbers and even numbers present in an array.*/
package com.example.JavaExamples;

import java.util.Scanner;

public class OddEvenMultiply {

    public static void main(String []args){

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int oddSum = 0 , evenSum = 0;

        if(n >= 1 && n<= 100000){

            for(int i = 0; i < n; i++){
                arr[i] = s.nextInt();
            }
        }

        for(int i = 0; i < arr.length; i++){

            if(arr[i] >= 1 && arr[i] <= 100000){
                int temp = (arr[i] % 2);
                switch(temp){

                    case 0:
                        evenSum = evenSum + arr[i];
                        break;
                    default:
                        oddSum = oddSum + arr[i];

                }
            }
        }

            int product = oddSum * evenSum;
            System.out.print(product);

    }
}
