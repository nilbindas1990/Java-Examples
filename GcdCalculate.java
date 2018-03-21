package com.example.JavaExamples;

import java.util.Scanner;

public class GcdCalculate {

    public static void main(String []args){

        Scanner s = new Scanner(System.in);
        int x , y;
        x = s.nextInt();
        y = s.nextInt();
        boolean a = (x >= 1 && x<= 100000) && (y >= 1 && y <= 100000);
        int[] factor1;
        int[] factor2;
        int result;
        if (a){
            result = gcdCalculate(x,y);
            
        }

    }

    private static int gcdCalculate(int x, int y) {
        

    }
}
