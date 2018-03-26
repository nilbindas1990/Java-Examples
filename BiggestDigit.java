package com.example.JavaExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BiggestDigit {

    public static void main(String [] args){

        Scanner s = new Scanner(System.in);

        //String num = s.next();
        int number = s.nextInt();
        int count = 0;
        int temp = number;
        if (number > 1 && number < 1000000000){


            while (temp > 0){
                temp = temp / 10;
                count++;
            }
        }

        temp = number;
        List<Integer> digits = new ArrayList<>();
        int module;
        for (int i = count - 1; i >= 0; i--){

            module = temp % 10;
            digits.add(module);
            temp = temp / 10;
        }


        System.out.println(Collections.max(digits));


    }
}
