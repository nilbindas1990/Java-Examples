/*
    Program to find whether a ginven number is a the pair of
    two elements in the the Array.
*/
package com.example.JavaExamples;

import java.util.Scanner;

public class FindSumPair {

    public static void main(String []args){

        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        String result = "False";
        boolean bool = false;
        //Array initialization.
        if (size >= 1 && size <= 100000){
            for (int i =0; i<size; i++){

                arr[i] = s.nextInt();
            }
            s.nextLine();
        }
        int num = s.nextInt();
        for (int i = 0; i<(arr.length - 1); i++){

            if (arr[i] == num) {
                //System.out.println("False");
                result = "False";
               continue;
            }
            else {
                for (int j = i + 1; j<arr.length; j++){
                    //int temp;
                    if (arr[i] + arr[j] == num){
                        bool = true;
                        break; //breaks for mthe loop whenever finds the pairs.
                    }
                    else{
                        //System.out.println("False");
                        bool = false;
                    }


                }
                if (bool){
                    result = "True";
                    break;
                }

            }
        }
        System.out.println(result);
    }
}
