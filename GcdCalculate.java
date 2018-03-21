package com.example.JavaExamples;

import java.util.Scanner;

public class GcdCalculate {

    public static void main(String []args){

        Scanner s = new Scanner(System.in);
        int x , y;
        x = s.nextInt();
        y = s.nextInt();
        boolean a = (x >= 1 && x<= 100000) && (y >= 1 && y <= 100000);
        int result = 0;
        if (a){
            //Calling function which will return the result as an int.
            //Comparing the numbers.
            if (x == y){
                result = x;
            }
            else if (x > y){
                result = gcdCalculate(x , y);
            }
            else {
                result = gcdCalculate(y , x);
            }

            
        }
        System.out.println(result);

    }

    /*Here you will use a recursive function
    which will call it self unless the "remainder" is 0
     */
    private static int gcdCalculate(int x, int y) {

        int temp;
        if (x % y != 0){
                temp = x % y;
                x = y;
                y = temp;
                gcdCalculate(x , y);
        }
        return y;
    }
}
