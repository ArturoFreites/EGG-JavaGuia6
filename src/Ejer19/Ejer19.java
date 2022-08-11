/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer19;

import java.util.Scanner;

/**
 *
 * @author luisa
 */
public class Ejer19 {

    private static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz.length; j++)
            {
                System.out.print(matriz[i][j] + "  ");

            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void rellenarMatriz(int[][] matriz) {

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz.length; j++)
            {
                System.out.println("Ingrese valor para la posicion " + i + " " + j);
                matriz[i][j] = input.nextInt();
            }
        }
    }

    private static void matrizTranspuesta(int[][] matriz, int[][] matrizTranspuesta) {

        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz.length; j++)
            {
                matrizTranspuesta[i][j] = matriz[j][i];
            }
        }
        imprimirMatriz(matrizTranspuesta);
    }

    private static boolean matrizAntisimetrica(int[][] matriz, int[][] matrizTranspuesta) {
        boolean cumple = true;
        
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz.length && cumple==true; j++)
            {
                if (!(matriz[i][j] == (matrizTranspuesta[i][j])*-1)){
                    cumple=false;
                }
            }
        }
        imprimirMatriz(matrizTranspuesta);
        
        return cumple;
    }

    public static void main(String[] args) {
        boolean respuesta;
        int[][] matriz = new int[3][3];
        int[][] matrizTranspuesta = new int[matriz.length][matriz.length];

        rellenarMatriz(matriz);
        imprimirMatriz(matriz);
        matrizTranspuesta(matriz, matrizTranspuesta);
        respuesta = matrizAntisimetrica(matriz, matrizTranspuesta);
        System.out.println("La matriz es anti simetrica? " + respuesta);
    }

}
