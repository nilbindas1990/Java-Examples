package com.example.JavaExamples;

import java.io.IOException;
import java.util.Scanner;

public class OddEvenSubtruct {

    public  static void main(String []args) throws Exception{

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

        if (oddSum > evenSum){
            int temp = oddSum - evenSum;
            System.out.print(temp);
        }
        else {
            int temp = evenSum - oddSum;
            System.out.print(temp);
        }
    }
}
