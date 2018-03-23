/*This is a simple program to find the average of total sum of even and odd numbers*/
package com.example.JavaExamples;

import java.util.Scanner;

public class OddEvenAverage {

    public static void main(String []args){

        Scanner s = new Scanner(System.in);
        int sizeOf = s.nextInt();

        int[] numArray = new int[sizeOf];
        int oddSum = 0 , evenSum = 0;
        int oddCount = 0 , evenCount = 0;
        if (sizeOf > 1 && sizeOf < 100000) {

            for (int i = 0; i < sizeOf; i++) {
                int toNum = s.nextInt();
                if (toNum > 1 && toNum < 100000) {
                    numArray[i] = toNum;
                }
            }
        }

        for (int i = 0; i < numArray.length; i++) {
            int temp = (numArray[i] % 2);

            if (temp == 0) {
                evenSum += numArray[i];
                evenCount += 1;
            } else {
                oddSum += numArray[i];
                oddCount += 1;
            }
        }

        int evenAvg = Math.round(evenSum / evenCount);
        int oddAvg = Math.round(oddSum / oddCount);
        int sum = evenAvg + oddAvg;

        System.out.print(sum);


    }
}
