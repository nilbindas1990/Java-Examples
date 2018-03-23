package com.example.JavaExamples;

import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String []args){

        Scanner s = new Scanner(System.in);
        String binaryString = s.next();
        int decimal = 0;
        int banaryInt = Integer.parseInt(binaryString);

        if (banaryInt >= 1 && banaryInt <= 1000000000){
            int[] binaryArray = new int[binaryString.length()];
            for (int i = 0; i < binaryArray.length; i++){
                binaryArray[i] = Integer.parseInt(String.valueOf(binaryString.charAt(i)));
            }


            for (int i = 0; i <binaryArray.length; i++){
                int product = (int) (binaryArray[i] * Math.pow(2 , (binaryArray.length -1 -i)));
                decimal = decimal + product;

            }

        }
        System.out.println(decimal);
    }
}
