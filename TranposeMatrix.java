package com.example.JavaExamples;

import java.util.Scanner;

public class TranposeMatrix {

    public static void main(String []args){

        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int col = s.nextInt();

        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                matrix[i][j] = s.nextInt();
            }
        }
        int[][] trnasposed = new int[col][row];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){

                trnasposed[j][i] = matrix[i][j];

            }
        }

        for (int i = 0; i < col; i++){
            for (int j = 0; j < row; j++){

                System.out.print(trnasposed[i][j] + " ");

            }
            System.out.println();
        }
    }
}
