package com.example.JavaExamples;

import java.util.Scanner;

public class GcdCalculate {

    public static void main(String []args){

        Scanner s = new Scanner(System.in);
        int x , y;
        x = s.nextInt();
        y = s.nextInt();
        boolean a = (x >= 1 && x<= 100000) && (y >= 1 && y <= 100000);
        //int result = 0;
        if (a){
            //Calling function which will return the result as an int.
            //Comparing the numbers.

            if (x > y){
                gcdCalculate(x , y);
            }
            else {
                gcdCalculate(y ,x);
            }

            
        }

    }

    /*Here you will use a recursive function
    which will call it self unless the "remainder" is 0
     */
    private static void gcdCalculate(int x, int y) {

        int temp = 0;
        if (x == y){
            System.out.println(x);
        }
        else{
            if (x % y != 0){
                //System.out.println("Y:" + y);
                temp = x % y; //System.out.println("temp:" + temp);
                x = y; //System.out.println("X:" + x);
                y = temp;
                gcdCalculate(x , y);
            }
            else {
                System.out.println(y);
            }

        }

    }
}
