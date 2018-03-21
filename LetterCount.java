package com.example.JavaExamples;

import java.util.Scanner;

public class LetterCount {

    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int upperCse = 0, lowerCase= 0;
        String line = s.nextLine();

        String lettters = line.trim();
        char ch = lettters.charAt(0);
        for (int i = 0; i<lettters.length(); i++){
            ch = lettters.charAt(i);
            if (Character.isUpperCase(ch)){
                upperCse ++;
            }
            else if (Character.isLowerCase(ch)){
                lowerCase++;
            }
        }
        System.out.println(upperCse);
        System.out.println(lowerCase);
    }
}
