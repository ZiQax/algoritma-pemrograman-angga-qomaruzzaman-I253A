/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.array2dimensi;

/**
 *
 * @author lenovo
 */

import java.util.Scanner;

public class Array2Dimensi {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.println(" ######### Program Java Input Matriks 2 Dimensi ########");
        System.out.println("========================================================");
        System.out.println();
        
        
        int[][] matriks = new int[100][100];
        int jum_baris, jum_kolom, i, j;
        
        System.out.println("Silahkan input jumlah baris matriks");
        jum_baris = input.nextInt();
        
        System.out.println("Silahkan input jumlah kolom matriks");
        jum_kolom = input.nextInt();
        System.out.println();
        
        //proses input array
        for(i=0; i<jum_baris; i++){
            for(j=0; j<jum_kolom; j++){
                System.out.print("Baris"+(i+1)+", kolom"+(j+i)+" = ");
                matriks[i][j]= input.nextInt();
            }
            System.out.println();
        }
      
        //display array
        for(i = 0; i < jum_baris; i++){
            for(j = 0; j < jum_kolom; j++){
                System.out.print(String.format("%3d", matriks[i][j])+ " ");
            }
            System.out.println();
        }
    }
}
