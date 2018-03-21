package com.example.JavaExamples;

import java.util.Scanner;

public class PowerRecursion {

    public static void main(String []args){

        Scanner s = new Scanner(System.in);
        int number = 0, power = 0;

        number = s.nextInt();
        power = s.nextInt();

        boolean a = number >= 1 && number <= 50;
        boolean b = power >= 0 && power <= 12;
        int result =0;
        if (a && b){

            result = calculatePowr(number,power);
        }
        System.out.println(result);
    }

    private static int calculatePowr(int number, int power) {

        //int funResult = number*calculatePowr(number,power-1);
        if (power >= 1) {
            return number * calculatePowr(number, power - 1);
        }
        else if(power == 0){
            return 1 * calculatePowr(1, power - 1);
        }
        else{
            return 1;
        }
    }
}
