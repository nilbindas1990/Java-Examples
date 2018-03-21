package com.example.JavaExamples;

import java.util.Scanner;

public class TwoMatricsPatch {
    public  static void main(String []args){

        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int col =s.nextInt();

        int [][] a = new int[row][col];
        boolean r = row >= 1 && row <= 100;
        boolean c = col >= 1 && col <= 100;
        if(r && c){
            for (int i = 0; i<row; i++){
                for (int j = 0; j<col; j++){
                    a[i][j] = s.nextInt();
                }
            }
        }
        int row2 = s.nextInt();
        int col2 =s.nextInt();

        int[][] b = new int[row2][col2];
        boolean r2 = row2 >= 1 && row2 <= 100;
        boolean c2 = col2 >= 1 && col2 <= 100;
        if (r2 && c2){
            for (int i = 0; i<row2; i++){
                for (int j = 0; j<col2; j++){
                    b[i][j] = s.nextInt();
                }
            }
        }

        int maxRow =0; int maxCol =0;
        if (row2 >= row){
            maxRow = row2;
        }
        else {
            maxRow = row;
        }
        if (col2 >= col){
            maxCol = col2;
        }
        else{
            maxCol = col;
        }
        int[][] sum = new int[maxRow][maxCol];
        for (int i =0; i < maxRow; i++){
            for (int j = 0; j < maxCol; j++){

                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        for (int i =0; i < maxRow; i++){
            for (int j = 0; j < maxCol; j++){
                System.out.print(sum[i][j] +" ");
            }
            System.out.println();
        }




    }
}
