package com.example.JavaExamples;

import java.util.Scanner;

public class SecondLergestNumberUpdated {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sizeOf = s.nextInt();

        int[] numArray = new int[sizeOf];
        if ((sizeOf >= 1) && (sizeOf <= 100000)) {

            for (int i = 0; i < sizeOf; i++) {
                int toNum = s.nextInt();
                if ((toNum >= 1) && (toNum <= 1000000000)) {
                    numArray[i] = toNum;
                }
            }
        }
        int large = numArray[0];
        int secondLarge = numArray[0];
        for (int j = 0; j < numArray.length; j++) {
            if (numArray[j] > large) {
                secondLarge = large;
                large = numArray[j];
            } else if (numArray[j] > secondLarge) {
                secondLarge = numArray[j];
            }
        }
        System.out.println(secondLarge);
    }
}
