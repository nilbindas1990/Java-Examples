package com.example.JavaExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinimumUnsortedArray {

    public static void main(String []args){

        Scanner s = new Scanner(System.in);
        List<Integer> unsorted = new ArrayList<Integer>();
//        int start = 0;
//        int end = 0;
        int n = s.nextInt();
        int[] fullArray = new int[n];
        if (n >= 1 && n <= 100000){

            for (int i = 0; i < n; i++){
                int temp = s.nextInt();
                if (temp >= 1 && temp <= 100000){
                    fullArray[i] = temp;
                }

            }

        }
        int left = leftDisorderIndex(fullArray);
        int right = rightDisorderIndex(fullArray);
        int min = fullArray[left];
        int max = fullArray[right];

        for (int i = left; i <= right; i++){
            if (fullArray[i] < min){
                min = fullArray[i];
            }
            if (fullArray[i] > max){
                max = fullArray[i];
            }
        }

        int startIndex = findMinUnsort(fullArray, 0 ,left , min);
        int endIndex = findMaxUnsort(fullArray , fullArray.length , right , max);


        for (int i = startIndex; i <= endIndex; i++){
            unsorted.add(fullArray[i]);
        }
        for (int aFullArray : fullArray) {
            System.out.print(aFullArray + " ");
            //System.out.println();
        }
        System.out.println();
        for (Integer anUnsorted : unsorted) {
            System.out.print(anUnsorted + " ");
        }

    }

    private static int findMinUnsort(int[] fullArray, int st, int left, int min) {
        for (int i = st; i <= left; i++){
            if (fullArray[i] > min){
                return i;
            }
        }
        return -1;
    }

    private static int findMaxUnsort(int[] fullArray, int length, int right, int max) {
        for (int i = length-1; i >= right; i--){
            if (max > fullArray[i]){
                return i;
            }
        }
        return -1;
    }

    private static int leftDisorderIndex(int[] fullArray) {

        for (int i = 0; i < fullArray.length; i++){
            if (fullArray[i] > fullArray[i+1]){
                return i;
            }
        }
        return -1;
    }

    private static int rightDisorderIndex(int[] fullArray) {

        for (int i = fullArray.length-1; i >= 0; i--){
            if (fullArray[i] < fullArray[i - 1]){
                return i;
            }
        }
        return -1;
    }
}
