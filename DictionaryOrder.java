package com.example.JavaExamples;

import java.io.IOException;
import java.util.Scanner;

public class DictionaryOrder {

    public static void main(String []args) throws IOException{

        Scanner s = new Scanner(System.in);
        int sizeOfArray = 0;

        try{
            sizeOfArray = Integer.parseInt(s.nextLine());
        }
        catch (NumberFormatException e){
            e.printStackTrace();
        }

        String[] words =new String[sizeOfArray];
        String temp;
        if (sizeOfArray >= 1 && sizeOfArray <= 100000){

            for (int i = 0; i<sizeOfArray; i++){

                //String  tempWord = s.nextLine();
                String  trimmed = s.nextLine().trim();

                if(trimmed.length() >= 1 && trimmed.length() <= 100){
                    words[i] = trimmed;
                }
                else {
                    continue;
                }
            }
        }
        for (int i = 0; i < (words.length - 1); i++){

            //StringBuilder st = new StringBuilder();
            for (int j = i+1; j<words.length; j++){

                if (words[i].compareTo(words[j]) > 0){

                    temp = words[i];
                    words[i] = words[j];
                    words [j] = temp;
                }

            }


        }
        for (int i =0; i<words.length; i++){
            System.out.println(words[i]);
        }
    }
}
