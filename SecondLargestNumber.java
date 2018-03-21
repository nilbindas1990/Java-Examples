package com.example.JavaExamples;

import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int sizeOf=0;

        try{
            sizeOf = Integer.parseInt(s.nextLine());
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
        String line = s.nextLine();
        String[] splitLine = line.split("\\s+");
        int large = Integer.parseInt(splitLine[0]), secondLarge = Integer.parseInt(splitLine[0]);

        int[] numArray = new int[sizeOf];
        if ((sizeOf >= 1) && (sizeOf <= 100000)){

            for (int i = 0; i<sizeOf; i++) {
                int toNum = Integer.parseInt(splitLine[i]);
                if ((toNum >= 1) && (toNum <= 1000000000)){
                    numArray[i] = toNum;
                }
            }
        }
        for (int j = 0; j<numArray.length; j++){
            if (numArray[j] > large){
                secondLarge = large;
                large = numArray[j];
            }
            else if (numArray[j] > secondLarge){
                secondLarge = numArray[j];
            }
        }
        System.out.println(secondLarge);
    }
}